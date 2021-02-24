/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional_1;

/**
 *
 * @author MANU
 */
import PaqueteLectura.Lector;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String ciudad;
        String nombreDueño;
        System.out.println("Ingrese el NOMBRE de la discografica");
        nombre = Lector.leerString();
        System.out.println("Ingrese la CIUDAD de la discografica");
        ciudad = Lector.leerString();
        System.out.println("Ingrese el NOMBRE del DUEÑO de la discografica");
        nombreDueño = Lector.leerString();
        
       Discografica discografica = new Discografica(nombre, ciudad, nombreDueño);
       int i = 0; 
       
       String nombreSolista = "";
       String instrumento = "";
       int cantTemas;
       System.out.println("Ingrese la CANTIDAD DE CANCIONES del solista");
       cantTemas = Lector.leerInt();
       if (cantTemas != 0){
           System.out.println("Ingrese el NOMBRE del solista");
           nombreSolista = Lector.leerString();
           System.out.println("Ingrese el INSTRUMENTO del solista");
           instrumento = Lector.leerString();
       }
       
       while (cantTemas != 0){
            discografica.agregarSolista(nombreSolista, instrumento, cantTemas, i);
            System.out.println("Ingrese la CANTIDAD DE CANCIONES del solista");
            cantTemas = Lector.leerInt();
            if (cantTemas != 0){
                System.out.println("Ingrese el NOMBRE del solista");
                nombreSolista = Lector.leerString();
                System.out.println("Ingrese el INSTRUMENTO del solista");
                instrumento = Lector.leerString();
             }
            i++;
       }
       
       i = 0; 
       String nombreBanda = "";
       String ciudadBanda = "";
       int cantIntegrantes;
       System.out.println("Ingrese la CANTIDAD DE INTEGRANTES de la banda");
       cantIntegrantes = Lector.leerInt();
       if (cantIntegrantes != 0){
           System.out.println("Ingrese el nombre de la CIUDAD de la banda");
           ciudadBanda = Lector.leerString();
           System.out.println("Ingrese el NOMBRE de la banda");
           nombreBanda = Lector.leerString();
       }
       
       while (cantIntegrantes != 0){
            discografica.agregarBanda(nombreBanda, ciudadBanda, cantIntegrantes, i);
            System.out.println("Ingrese la CANTIDAD DE CANCIONES del solista");
            cantTemas = Lector.leerInt();
            System.out.println("Ingrese la CANTIDAD DE INTEGRANTES de la banda");
            cantIntegrantes = Lector.leerInt();
            if (cantIntegrantes != 0){
                System.out.println("Ingrese el nombre de la CIUDAD de la banda");
                ciudadBanda = Lector.leerString();
                System.out.println("Ingrese el NOMBRE de la banda");
                nombreBanda = Lector.leerString();
            }
            i++;
       }
        System.out.println("");
        System.out.println("La cantidad de bandas de la discografica es " + discografica.getCantBanda());
        System.out.println("");
        
        System.out.println("Ingrese un Instrumento " );
        String instrumentoBuscado = Lector.leerString();
        System.out.println("La cantidad de solistas que tocan " + instrumentoBuscado + " es " + discografica.buscarInstrumento(instrumentoBuscado));
        System.out.println("");
        
        System.out.println("La banda con mas integrantes es " + discografica.bandaMax() );
        System.out.println("");
        
        System.out.println(discografica.mismaCiudad() + " bandas pertenecen a la misma ciudad que la discografica");
        
       
       
       
        
    }
    
}
