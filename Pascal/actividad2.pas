program numaleatorio;
var
num:integer;
num2: integer;
cant:integer;
begin
Randomize;
writeln('ingrese un numero de 1 a 10');
read(num2);
num:=random(11);
while (num <> num2) do begin
      cant:=cant +1;
      num:=random(11);
end;
writeln('la cantidad de repeticiones es: ', cant);
readln;
readln;
end.
