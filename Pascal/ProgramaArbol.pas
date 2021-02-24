program procesos_arbol;
Type

  arbol = ^nodo;
  nodo = record
           dato: integer;
           HI: arbol;
           HD: arbol;
         end;
  listaNivel= ^nodoL;
  nodoL = record
            datos: arbol;
            sig: listaNivel;
          end;       
 


Procedure Insertar(var a:arbol; num:integer);
begin
  if(a=nil) then begin
     new(a);
     a^.dato:=num;
     a^.HI:=nil;
     a^.HD:=nil;
  end
  else begin
     if(a^.dato>num) then
        insertar(a^.HI,num)
     else
        insertar(a^.HD,num);
  end;
end;


function ContarElementos (l: listaNivel): integer;
  var c: integer;
begin
 c:= 0;
 While (l <> nil) do begin
   c:= c+1;
   l:= l^.sig;
 End;
 contarElementos := c;
end;

Procedure AgregarAtras (var l, ult: listaNivel; a:arbol);
 var nue:listaNivel;
 begin
 new (nue);
 nue^.datos := a;
 nue^.sig := nil;
 if l= nil then l:= nue
           else ult^.sig:= nue;
 ult:= nue;
 end;

Procedure imprimirpornivel(a: arbol);
var
   l, aux, ult: listaNivel;
   nivel, cant, i: integer;
begin
   l:= nil;
   if(a <> nil)then begin
                 nivel:= 0;
                 agregarAtras (l,ult,a);
                 while (l<> nil) do begin
                    nivel := nivel + 1;
                    cant:= contarElementos(l);
                    write ('Nivel ', nivel, ': ');
                    for i:= 1 to cant do begin
                      write(l^.datos^.dato, ' - ');
                      if (l^.datos^.HI <> nil) then agregarAtras (l,ult,l^.datos^.HI);
                      if (l^.datos^.HD <> nil) then agregarAtras (l,ult,l^.datos^.HD);
                      aux:= l;
                      l:= l^.sig;
                      dispose (aux);
                     end;
                     writeln;
                 end;
               end;
end;

procedure crear_arbol_binario(var a:arbol);
var
   valor:integer;
begin
     writeln(' Ingrese un valor o -1 para terminar: ');
     read(valor);
     while(valor <>-1) do begin
      Insertar(a, valor);
      writeln(' Ingrese un valor o -1 para terminar: ');
      read(valor);
      end;
end;


procedure recorrido_en_orden(a:arbol);    {recorrido imprime --->(izq) - raiz - (der)}
begin
if(a<>nil)then begin
   recorrido_en_orden(a^.hi);
   write(' ',a^.dato, ' -');
   recorrido_en_orden(a^.hd);
   end;
end;


procedure recorrido_pre_orden(a:arbol);    {recorrido imprime pre-orden ---> raiz-(izq) - (der)}
begin
if(a<>nil)then begin
   write(' ',a^.dato, ' -');
   recorrido_en_orden(a^.hi);

   recorrido_en_orden(a^.hd);
   end;
end;



procedure recorrido_post_orden(a:arbol);    {recorrido imprime post-orden ---> (izq) - (der)- raiz}
begin
if(a<>nil)then begin

   recorrido_en_orden(a^.hi);
   recorrido_en_orden(a^.hd);
   write(' ',a^.dato, ' -');
   end;
end;


function buscar(a:arbol ; valor:integer):arbol;
begin
if(a <> nil)then
  if(a^.dato=valor)then
     buscar:=a
    else
     if(valor > a^.dato)then
         buscar(a^.hd,valor)
         else
         buscar(a^.hi,valor)

else
 buscar:= nil
end;







{programa principal}

var
   a:arbol;
   valor:integer;
begin
     a:=nil;
     crear_arbol_binario(a);
     {imprimirpornivel(a);
     recorrido_en_orden(a);
     writeln('');
     recorrido_pre_orden(a);
     writeln('');
 }
     recorrido_post_orden(a);
     writeln('');
     writeln('ingrese un valor a buscar ..');
     readln(valor);
     if (buscar(a,valor) <> nil)then
        writeln('se encontro el dato')
        else
         writeln('no se encontro el dato');
     readln();
     readln();


end.
