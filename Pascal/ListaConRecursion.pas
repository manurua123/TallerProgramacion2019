program lista_con_recursion;
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
    while(elem.cod <>15)do begin
        agregar_adelante(l,elem);
        elem.cod:=random(16);
    end;
end;

procedure imprimir_orden (l:lista);
begin
	if (l<>nil) then begin
 		write(l^.dato.cod, ' | ');
   		imprimir_orden(l^.sig);
	end;
end;

procedure imprimir_orden_inverso(l:lista);
begin
    if(l<>nil) then begin
    	Imprimir_orden_inverso(l^.sig);
    	write(l^.dato.cod, ' | ');
    end;
end;

procedure imprime_lista_ingresada(l:lista);
begin
	while(l<>nil)do begin
     	write(l^.dato.cod, ' | ');
      	l:=l^.sig;
     end;
end;

var
   l:lista;
begin
    l:=nil;
    crear_lista_agregar_adelante (l);
    writeln('lista: ');
    imprime_lista_ingresada(l);
    writeln(' ');
    writeln(' ');
    writeln('lista en orden: ');
    writeln(' ');
    imprimir_orden(l);
    writeln(' ');
    writeln('');
    writeln('lista en orden inerso:  ');
    writeln(' ');
    imprimir_orden_inverso(l);
    writeln(' ');
    readln();
    readln();
    readln();
end.
