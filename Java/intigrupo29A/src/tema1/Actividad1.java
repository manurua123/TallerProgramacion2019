/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author alumnos
 */
import PaqueteLectura.Lector;
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("ingrese valor del lado A: ");
        double ladoA = Lector.leerDouble();
        System.out.print("ingrese valor del lado B: ");
        double ladoB = Lector.leerDouble();
        System.out.print("ingrese valor del lado C: ");
        double ladoC = Lector.leerDouble();
        if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoC + ladoA)) && (ladoC < (ladoA + ladoB))){
                double perimetro = (ladoA + ladoB + ladoC);
                System.out.println("es triagulo y el perimetro es: " +  perimetro);}
        else {
                System.out.println("no es triangulo");
        }      
    }
}
