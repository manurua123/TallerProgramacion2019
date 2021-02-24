program potencianumeros;
function potencia(x,n:integer):integer;
begin
if(n=0)then
potencia:=1
else
potencia:=x*potencia(x,n-1);
end;

function potencia1(x,n:integer) :real;
begin                                        {ERRROR: la funcion se ejecuta infinitas veces}
     potencia1:= x*potencia1 (x,n-1);
end;

var
base,exponente:integer;

begin
writeln('ingrese la base');
readln(base);
writeln('ingrese el exponente');
readln(exponente);
writeln('el resyltado de la potencia es: ' , potencia(base,exponente));
readln();
readln();
end.
