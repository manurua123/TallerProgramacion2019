/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author alumnos
 */

public class Triangulo {
    private double a;
    private double b;
    private double c;  
    private String relleno;
    private String linea; 

public Triangulo(double A, double B, double C, String colorRelleno, String colorLinea){
    a= A;
    b= B;
    c= C;
    relleno = colorRelleno;
    linea = colorLinea;
    
}

public Triangulo (){
    
}
public double getLadoA (){
    return a;
}
public double getLadoB (){
    return b;
}
public double getLadoC (){
    return c;
}
public String getRelleno(){
    return relleno;
}
public String getLinea(){
    return linea;
}


public void  setLadoA (double ladoA){
     a=ladoA;
}
public void setLadoB (double ladoB){
    b=ladoB;
}
public void setLadoC (double ladoC){
    c=ladoC;
}
public void setRelleno(String colorRelleno){
    relleno=colorRelleno;
}
public void setLinea(String colorLinea){
    linea=colorLinea;
}

public double calcularArea(){
    double aux;
    double area;
    aux = (a+b+c)/2;
    area = Math.sqrt(aux*(aux-a)*(aux-b)*(aux-c));
    return area;     
}
public double calcularPerimetro(){
double aux;
aux=(a+b+c);
return aux;}

}