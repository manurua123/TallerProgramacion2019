program merge;
type
   categoria=record
   rubro:integer;
   subtotal:integer;
   fecha:integer;
   end;
lista =^nodo;
nodo=record
dato:categoria;
sig:lista;
end;

cat2=record
rubro:integer;
subtotal:integer;
end;


lista2 =^nodo2;
nodo2=record
dato2:cat2;
sig:lista2;
end;

vector=array [1..4] of lista;



 procedure insertar_en_lista(var pri:lista; c:categoria);
var
  ant,nue,act:lista;
begin
  new(nue);
  nue^.dato:=c;
  act:=pri;
  while(act<>NIL)and(act^.dato.rubro < c.rubro)do begin
    ant:=act;
    act:=act^.sig;
  end;
  if(act = pri) then
    pri:=nue
  else
    ant^.sig:=nue;
  nue^.sig:=act;
end;


                                                                   {crea una lista del consumo de cada integrante}
procedure crear_lista_ordenada(var v:vector; pos:integer);
var
  c:categoria;
begin

  c.rubro:=random(6);
  c.subtotal:=random(101);
  c.fecha:=random(32);

  while(c.rubro <> 5)do begin
      insertar_en_lista(v[pos],c);
      c.rubro:=random(6);
      c.subtotal:=random(101);
      c.fecha:=random(32);

  end;
end;


procedure imprimir_lista(v:vector);
var
i:integer;
begin
     for i:=1 to 4 do begin
     writeln();
     writeln('---------------------------');
     writeln('   gastos familiar ', i, ':    ');
     writeln('---------------------------');
      writeln();
         while (v[i]<> nil) do begin
               writeln(' Rubro:  ',v[i]^.dato.rubro);
               writeln(' Gasto:  ',v[i]^.dato.subtotal);
               writeln(' Fecha:  ',v[i]^.dato.fecha);
               writeln('.,.,.,.,.,.,.,.,.');
               v[i]:= v[i]^.sig;
         end;
         writeln();
         end;
end;



 procedure determinar_minimo(var v:vector; var cant:integer; var rubro:integer);
var
   i:integer;
begin
     cant:=0;


   for i:=1 to 4 do begin
       if(v[i]<> nil) then begin
       while(v[i]<>nil) and (v[i]^.dato.rubro = rubro) do begin
                  cant:= cant+ v[i]^.dato.subtotal;
                  v[i]:=v[i]^.sig;
               end;
    end;

  end;

end;



procedure agregar_atras(var pri, ult: lista2; c2:cat2);
var
   nue:lista2;
begin
     new(nue);
     nue^.dato2:=c2;
     nue^.sig:=NIL;
     if(pri <> NIL) then
            ult^.sig:=nue
            else
                pri:=nue;
     ult:=nue;
end;

procedure crear_lista_agregar_atras(var l:lista2; v:vector);
var
   c2:cat2;
   ult: lista2;
   cant:integer;
   r:integer;

begin
     r:=0;
     determinar_minimo(v,cant,r);
     while (r <> 5) do begin
           c2.subtotal:=cant;
           c2.rubro:=r;
           agregar_atras(l, ult, c2);
           r:=r+1;
           determinar_minimo(v,cant,r);

     end;
end;




procedure imprimir_lista_final(l:lista2);
begin
     writeln('---------------------------');
     writeln('   GASTOS DEL MES  :    ');
     writeln('---------------------------');
     writeln();
     while (l<>nil) do begin
           writeln(' Rubro ',l^.dato2.rubro );
           writeln(' $ ',l^.dato2.subtotal);
           writeln('.,.,.,.,.,.,.,.,');
           l:=l^.sig;
     end;
end;



var

v:vector;
i:integer;
l_2:lista2;

begin
     randomize;
     l_2:=nil;
     for i:=1 to 4 do
         crear_lista_ordenada(v,i);
     imprimir_lista(v);

     crear_lista_agregar_atras(l_2, v);


     imprimir_lista_final(l_2);

     readln();
     readln();





end.
