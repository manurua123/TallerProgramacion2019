program final1;
const
	maxProducto= 300;
type 
	venta = record
		numProducto: 1..maxProducto;
		cantVendida:integer;
		nombreProducto: integer;
	end;
	lista =^nodo;
	nodo = record
		cont : venta;
		sig: lista;
	end;
	tablaPrecio = array [1..maxProducto] of real;
	tablaVentasTotal = array[1..maxProducto] of real;
procedure insertar_en_lista (var pri:lista; elem: venta);
var
	ant, nue, act:lista;
begin
	new(nue);
	nue^.cont:= elem;
	act:=pri;
	while(act<>NIL) and(act^.cont.numProducto < elem.numProducto) do 
	begin
		ant:=act;
		act:=act^.sig;
	end;
	if(act = pri) then
		pri:=nue
	else
		ant^.sig:=nue;
	nue^.sig:=act;
end;
procedure crear_lista_ordenada(var l:lista);
var
	elem: venta;
begin 
	elem.numProducto:= random(300);
	elem.cantVendida:= random(20);
	elem.nombreProducto := random(300);
	while(elem.cantVendida < 0) do begin
		insertar_en_lista(l,elem);
		elem.numProducto := random(300);
		elem.cantVendida:= random(10);
		elem.nombreProducto := random(300);
	end;
end;
procedure crear_vector_precios(var v:tablaPrecio);
var
	i:integer;
begin
	for i:=0 to 300 do
		v[i]:= random(100);
end;
procedure ventas_totales(var total: tablaVentasTotal; l:lista; v:tablaPrecio);
var
	aux:integer;
begin
	aux:=0;
	while(l <> nil) do begin
		aux:= l^.cont.numProducto;
		while((aux = l^.cont.numProducto) and (l <> nil)) do begin
			total[aux]:= v[aux]*l^.cont.cantVendida;
			l:=l^.sig;
		end;
	end; 
end;

procedure imprimir_lista(l:lista);
begin
	while(l<> nil) do begin
		write(l^.cont.numProducto, ' | ', l^.cont.cantVendida, ' | ', l^.cont.nombreProducto);
		writeln();
	end;
end;

procedure minimo (v:tablaVentasTotal; var min:real; var productoMinimo:integer);
var
	i: integer;
begin
	for i:=0 to maxProducto do 
		if(v[i] < min) then begin
			min:=v[i];
			productoMinimo:= i;
		end;
end;


var
	l:lista;
	vectorPrecios:tablaPrecio;
	vectorTotal:tablaVentasTotal;
	min:real;
	productoMinimo:integer;
begin
    randomize;
	l:=nil;
	min:= 9999;
	productoMinimo:=-1;
	crear_vector_precios(vectorPrecios);
	crear_lista_ordenada(l);
	imprimir_lista(l);
	ventas_totales(vectorTotal,l,vectorPrecios);
	minimo(vectorTotal, min, productoMinimo);
end.






	

