program VECTORLISTA;
uses
    sysutils;
type
    rango_categoria = 1..4;
    rango_anos= 1980..2019;
    empleado=record
       num:integer;
       apellido:string;
       ano:rango_anos;
    end;
    lista=^nodo;
    nodo=record
       dato:empleado;
       sig:lista;
    end;
    vec_categorias = array [1..4] of lista;
     empleado_leer=record
       num:integer;
       apellido:string;
       ano:rango_anos;
       categoria:rango_categoria;
    end;
procedure borrar_vector (var v:vec_categorias);
var
   i:rango_categoria;
begin
     for i:=1 to 4 do
         v[i]:=NIL;
end;
procedure leer_empleado(var e:empleado_leer);
begin
     e.num:= random(100);
     if(e.num<>0) then begin
                  e.apellido:='ape_' + intToStr (random(100));
                  e.ano:=random(2020);
                  e.categoria:=random(5);
     end;
end;

procedure registro_lista(var e_lista:empleado; e:empleado_leer);
begin
     e_lista.apellido:=e.apellido;
     e_lista.ano:=e.ano;
     e_lista.num:=e.num;
end;


procedure insertar_en_lista(var pri:lista; elem:empleado);
var
   ant,nue,act:lista;
begin
     new(nue);
     nue^.dato:=elem;
     act:=pri;
     while(act<>NIL)and(act^.dato.apellido < elem.apellido)do begin
            ant:=act;
            act:=act^.sig;
     end;
     if(act = pri) then
            pri:=nue
            else
            ant^.sig:=nue;
     nue^.sig:=act;
end;




  procedure crear_lista_ordenada(var v:vec_categorias);
var
   emp:empleado_leer;
   emp_lista:empleado;
begin
     leer_empleado(emp);
     while(emp.num <> 0)do begin
         registro_lista(emp_lista,emp);
         insertar_en_lista(v[emp.categoria],emp_lista);
         leer_empleado(emp);
     end;
end;


 procedure imprimir_listas(v:vec_categorias);
 var
 i:integer;
 begin
 for i:=1 to 4 do  begin
 writeln('la categoria ', i, 'esta formada por: ');
  while(v[i]<> nil) do begin
   writeln(v[i]^.dato.apellido);
   writeln(v[i]^.dato.ano);
   writeln(v[i]^.dato.num);
   v[i]:=v[i]^.sig;
  end;
 end;
end;






var
v:vec_categorias;

begin
randomize;
borrar_vector(v);
crear_lista_ordenada(v);
imprimir_listas(v);
readln;
readln;



end.
