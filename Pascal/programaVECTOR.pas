program vectores;
const
     dimF = 10;
type
    vector = array[1..dimf] of integer;
procedure agregar(var v:vector;var dimL:integer; elem:integer; var exito:boolean);
begin
     if(dimL<dimF) then begin
                   dimL:=dimL+1;
                   v[dimL]:=elem;
                   exito:=true;
     end
     else
         exito:=false;
end;

procedure crear_vector(var v:vector; var dimL:integer);
var
   elem:integer;
   exito:boolean;
begin
     randomize;
     elem:=random(16);
     while ( elem <> 15) do begin
           agregar(v,dimL,elem,exito);
           elem:=random(16);
     end;
end;


procedure busqueda_dic(v:vector ; ini:integer ; fin :integer ;dato :integer ; var pos:integer);
var
medio:integer;
begin
if (ini>fin)then
 pos:=0
 else
 begin
    medio:=(ini+fin)div 2 ;
  if(dato=v[medio])then
     pos:=medio
     else
     if(v[medio]>dato)then
          busqueda_dic(v,ini,medio-1,dato,pos)
          else
          busqueda_dic(v,medio+1,fin,dato,pos);
end;
end;






procedure imprimir_vector(v:vector;dimL:integer);
var
   i:integer;
begin
for i:=1 to diml do
     write('----');
     writeln('');
     for i:=1 to dimL do
         write(' ', v[i], ' |');
   writeln('');
   for i:=1 to diml do
     write('----');


end;

var
   v:vector;
   dimL:integer;
   buscado:integer;
   pos:integer;
begin
   dimL:=0;
   pos:=0;
   crear_vector(v,dimL);
   imprimir_vector(v,dimL);
   read(buscado);
   busqueda_dic(v,1, dimL, buscado, pos);
   readln;
   readln;
end.






begin


end.
