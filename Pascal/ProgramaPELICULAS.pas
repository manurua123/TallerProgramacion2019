program PELICULAS;
uses
  sysutils
type
    genero=1..8;
    pelicula_v= record
              cod:integer;
              titulo:string;
              cod_genero:genero;
              puntaje:real;
    end;

    pelicula_l= record
              cod:integer;
              titulo:string;
              puntaje:real;
    end;

    lista=^nodo;
    nodo=record
               dato:pelicula_l;
               sig:lista;
    end;

    vec_genero = array [1..8] of lista;

procedure borrar_vector (var v:vec_genero);
var
   i:genero;
begin
     for i:=1 to 8 do
         v[i]:=NIL;
end;

procedure registro_lista(var p_lista:pelicula_l; p:pelicula_v);
begin
     p_lista.cod:=p.cod;
     p_lista.titulo:=p.titulo;
     p_puntaje:=p.puntaje;
end;


procedure insertar_en_lista(var pri:lista; elem:pelicula_l);
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































begin

end.
