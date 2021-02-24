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



procedure agregar_atras(var pri, ult: lista; elem:elemento);
var
   nue:lista;
begin
     new(nue);
     nue^.dato:=elem;
     nue^.sig:=NIL;
     if(pri <> NIL) then
            ult^.sig:=nue
            else
                pri:=nue;
     ult:=nue;
end;



procedure insertar_en_lista(var pri:lista; elem:elemento);
var
   ant,nue,act:lista;
begin
     new(nue);
     nue^.dato:=elem;
     act:=pri;
     while(act<>NIL)and(act^.dato.cod < elem.cod)do begin
            ant:=act;
            act:=act^.sig;
     end;
     if(act = pri) then
            pri:=nue
            else
            ant^.sig:=nue;
     nue^.sig:=act;
end;




procedure crear_lista_agregar_atras(var l:lista);
var
   elem:elemento;
   ult: lista;

begin
     Randomize;
     elem.cod:=random(16);
     while (elem.cod <> 15) do begin
           agregar_atras(l, ult, elem);
           elem.cod:=random(16);
     end;
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



procedure crear_lista_ordenada(var l:lista);
var
   elem:elemento;
begin
     Randomize;
     elem.cod:=random(16);
     while(elem.cod <> 15)do begin
         insertar_en_lista(l,elem);
         elem.cod:=random(16);
     end;
end;



procedure imprimir_lista(l:lista);
begin
while(l<>nil)do begin
  writeln('numero:' , l^.dato.cod);
  l:=l^.sig;
end;
end;



procedure borrar_elemento(var pri:lista;valor:integer;var exito:boolean);
var ant,act:lista;
begin
     exito:=false;
     act:=pri;
     while(act<>nil)and(act^.dato.cod<>valor)do begin
          ant:=act;
         act:=act^.sig;
     end;
     if(act<>nil)then begin
         exito:=true;
         if (act=pri)then
             pri:=act^.sig
          else
          ant^.sig:=act^.sig;
          dispose(act);
    end;
end;




procedure borrar_elemento_en_orden(var pri:lista;valor:integer;var exito:boolean);
var ant,act:lista;
begin
     exito:=false;
     act:=pri;
     while(act<>nil)and(act^.dato.cod < valor)do begin
          ant:=act;
         act:=act^.sig;
     end;
     if(act<>nil)then begin
        if(act^.dato.cod = valor) then begin
           exito:=true;
           if (act=pri)then
             pri:=act^.sig
          else
            ant^.sig:=act^.sig;
            dispose(act);
        end;
    end;
end;




procedure eliminar_elemento_con_orden(var l:lista);
var
valor:integer;
exito:boolean;
begin
writeln('ingrese un valor');
readln(valor);
borrar_elemento_en_orden(l,valor,exito);
if(exito=true)then
  writeln('se encontro el elemento y se elimino')
else
  writeln('no se encontro el elemento');
end;




procedure eliminar_elemento(var l:lista);
var
valor:integer;
exito:boolean;
begin
writeln('ingrese un valor');
readln(valor);
borrar_elemento(l,valor,exito);
if(exito=true)then
writeln('se encontro el elemento y se elimino')
else
writeln('no se encontro el elemento');
end;



var
l:lista;

begin
l:=NIL;
crear_lista_ordenada(l);
imprimir_lista(l);
eliminar_elemento_con_orden(l);
imprimir_lista(l);
readln;
readln;
end.






begin

end.
