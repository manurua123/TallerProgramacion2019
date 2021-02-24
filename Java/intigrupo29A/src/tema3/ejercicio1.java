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
import PaqueteLectura.Lector;
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double a,b,c;
     String color,linea; 
      
     System.out.println("Ingrese el lado A");
     a=Lector.leerDouble();
     // triangulo1.setLadoA(a);
     System.out.println("Ingrese el lado B");
     b=Lector.leerDouble();
     //triangulo1.setLadoB(b);
     System.out.println("Ingrese el lado C");
     c=Lector.leerDouble();
     //triangulo1.setLadoC(c);
     System.out.println("Ingrese el lado color de relleno");
     color=Lector.leerString();
     //triangulo1.setRelleno(color);
     System.out.println("Ingrese el lado color de linea");
     linea=Lector.leerString();
     //triangulo1.setLinea(linea);
     Triangulo triangulo1 = new Triangulo(a,b,c,color,linea); 
     
     
     
     System.out.println("el triangulo formado por los lados "+ triangulo1.getLadoA() + ", " + triangulo1.getLadoB() + " y " + triangulo1.getLadoC());
     System.out.println("el color de relleno es " + triangulo1.getRelleno() + " y el color de linea es " + triangulo1.getLinea());
     
     System.out.println("el area del tringualo es " + triangulo1.calcularArea());
     System.out.println ("el perimietro del triangulo es " + triangulo1.calcularPerimetro());
     
    }
    
}
