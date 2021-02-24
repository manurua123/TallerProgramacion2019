program mezcla;
type

lista=^nodo;
nodo=record
isbn:integer;
sig:lista;
end;

vector=array [1..4] of lista;



 procedure insertar_en_lista(var pri:lista; num:integer);
var
  ant,nue,act:lista;
begin
  new(nue);
  nue^.isbn:=num;
  act:=pri;
  while(act<>NIL)and(act^.isbn < num)do begin
    ant:=act;
    act:=act^.sig;
  end;
  if(act = pri) then
    pri:=nue
  else
    ant^.sig:=nue;
  nue^.sig:=act;
end;



procedure crear_lista_ordenada(var v:vector; pos:integer);
var
  nom:integer;
begin

  nom:=random(11);

  while(nom <> 10)do begin
      insertar_en_lista(v[pos],nom);
      nom:=random(11);

  end;
end;

procedure imprimir_lista(v:vector);
var
i:integer;
begin
     for i:=1 to 4 do begin
     writeln();
     writeln('--------------------');
     writeln('|    ESTANTE ',i,'     |');
      writeln('--------------------');


         while (v[i]<> nil) do begin
               write(' ',v[i]^.isbn, ' |');
               v[i]:= v[i]^.sig;
         end;
         writeln();

         end;
end;

procedure determinar_minimo( var v:vector; var libroMinimo:integer);
var
   aux:lista;
   estanteMinimo:integer;
   i:integer;
begin

libroMinimo :=  99;
for i:= 1 to 4 do
    if ( v[i] <> nil ) then
       if ( v[i]^.isbn  < libroMinimo ) then  begin
        libroMinimo :=  v[i]^.isbn;
        estanteMinimo:= i;
     end;
if (libroMinimo <> 99) then  begin
   aux:=v[estanteminimo];
   v[estanteMinimo]:= v[estanteMinimo]^.sig;
   dispose(aux);
end;

end;



procedure agregar_atras(var pri, ult: lista; num:integer);
var
   nue:lista;
begin
     new(nue);
     nue^.isbn:=num;
     nue^.sig:=NIL;
     if(pri <> NIL) then
            ult^.sig:=nue
            else
                pri:=nue;
     ult:=nue;
end;

procedure crear_lista_agregar_atras(var l:lista; v:vector);
var
   min:integer;
   ult: lista;

begin
     determinar_minimo(v,min);
     while (min <> 99) do begin
           agregar_atras(l, ult, min);
           determinar_minimo(v,min);
     end;
end;

procedure imprimi_lista_final(l:lista);
begin
     while (l<>nil) do begin
           write(' ',l^.isbn, ' |');
           l:=l^.sig;
     end;
end;





{programa principal}
var
 i:integer;
 v:vector;
 l:lista;
begin
     randomize;
     for i:=1 to 4 do
         crear_lista_ordenada( v, i);
     imprimir_lista(v);
     crear_lista_agregar_atras(l, v);
     writeln('-------------------------');
     writeln('|    ESTANTE ORDENAD    |');
     writeln('-------------------------');
     imprimi_lista_final(l);
     readln();
     readln();


end.

