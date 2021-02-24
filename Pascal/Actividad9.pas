program elementos;
type
    elemento=record
    cod:integer;
end;

lista=^nodo;
   nodo=record
   dato:elemento;
   sig:lista;
end;

procedure agregar_adelante(var l:lista; elem:elemento);
var
   nue:lista;
begin
     new(nue);
     nue^.dato:=elem;
     nue^.sig:=l;
     l:=nue;
end;

procedure crear_lista_agregar_adelante(var l:lista);
var
elem:elemento;
begin
     Randomize;
     elem.cod:=random(16);
     while(elem.cod <> 15)do begin
         agregar_adelante(l,elem);
         elem.cod:=random(16);
     end;
end;

procedure  comparacion(l:lista; var elem:integer; var exito:boolean );
begin
     if (l<>nil) then begin
           elem:= l^.dato.cod;
           comparacion(l^.sig,elem,exito);
           end;
     if(l^.dato.cod=elem)then
      exito:=true
     else
     exito:=false;
     end;





var
l:lista;
elem:integer;
ex:boolean;
begin
l:=nil;
 crear_lista_agregar_adelante(l);
 comparacion(l,elem,ex);
 if(ex=true)then
 writeln('la palabra es palindrome!');
 readln();
 readln();
end.

