
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.Lector;
public class Ej05Jugadores {

  
    public static void main(String[] args) {
        double [] jugadores;
        int df = 3;
        jugadores = new double [df];
        double suma = 0;
        int i; 
        for (i = 0; i < df; i++) {
                System.out.println("ingrese altura");
                jugadores[i] = Lector.leerDouble();
                suma = jugadores[i] + suma;
        }
        double promedio = suma / df;
        System.out.println("el promedio de alturas es " + promedio);
        int j;
        int cant = 0;
        for (j = 0; j < df; j++){
                if (jugadores[j] > promedio ){
                   cant++; 
                }
        }
        System.out.println("la cantidad de jugadores que supera el promedio es " + cant);     
    }
    
}
