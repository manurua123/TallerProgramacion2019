program recursion;
type
    digitos= -1..9;

procedure dig_max_rec(n:integer;var max:digitos);
var
   dig:integer;
begin
     if(n<>0) then begin
              dig:= n mod 10;
              if(dig > max) then
                     max:=dig;
              n:= n div 10;
              {writeln('max: ', max); }
              dig_max_rec(n,max);
              {writeln('max: ', max);  }
    end;
end;
procedure imprimir_digito2(n:integer);
var
   dig:integer;
begin
     if(n<>0) then begin
              dig:= n mod 10;
              n:= n div 10;
              imprimir_digito2(n);
              writeln(dig);

    end;
end;

procedure imprimir_digito1(var n:integer);
var
   dig:integer;
begin
     if(n<>0) then begin
              dig:= n mod 10;
              imprimir_digito1(n);
              n:= n div 10;
              writeln(dig);
    end;
end;



var
   num:integer;
   max:digitos;
begin
     max:=-1;
     writeln('ingrese un numero entero: ');
     readln(num);
     writeln('');
     imprimir_digito2(num);
     {imprimir_digito1(num);   }
     {dig_max_rec(num,max);
     writeln('El digito maximo es: ', max); }
     readln();
     readln();

end.
