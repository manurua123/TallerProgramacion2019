program arreglo;
const
     dimF= 10;
type
    vector = Array [1..dimF] of integer;

procedure agregar(var v:vector; var diml:integer; elem:integer; var exito:boolean);
begin
     if (diml < dimF) then begin
        diml:=diml+1;
        v[diml]:=elem;
        exito:=true;
        end
     else
         exito:=false;

end;
procedure crear_vector(var v:vector; var dimL:integer);
var
   valor:integer;
   exito:boolean;
begin
     randomize;
     valor:=random(16);
     while ( valor <> 15) do begin
           agregar(v,dimL,valor,exito);
           valor:=random(16);
     end;
end;
procedure imprimir_vector(v:vector;dimL:integer);
var
   i:integer;
begin
     writeln('----------------------------------------------');
     for i:=1 to dimL do
         write(' ', v[i] ,' |');
     writeln('');
     writeln('----------------------------------------------');
end;

procedure ordenar_por_incersion(var v:vector; diml:integer);
var
  i, j, actual : integer;
begin
    for i:=1 to diml do begin
        actual := V[i];
        j:= i - 1;
        while ((j > 0) and (v[j] > actual)) do begin
            v[j + 1] :=  V[j];
            j := j - 1;
        end;
        v[j + 1] := actual;
    end;
end ;


var
   v:vector;
   dimL:integer;
begin
     randomize;
     dimL:=0;

     crear_vector(v,dimL);
     writeln(' Vector Desordenado: ');
     imprimir_vector(v,dimL);
     ordenar_por_incersion(v,diml);
     writeln(' Vector Ordenada: ');
     imprimir_vector(v,dimL);

     readln();
     readln();
end.
