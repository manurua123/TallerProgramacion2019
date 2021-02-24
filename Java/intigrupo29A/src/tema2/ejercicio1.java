/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

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
        // TODO code application logic here
       
        System.out.println("Ingrese nombre");
        String nombre = Lector.leerString();
        System.out.println("Ingrese DNI");
        int dni = Lector.leerInt();
        System.out.println("Ingrese edad");
        int edad = Lector.leerInt();
        
        Persona persona1 = new Persona (nombre,dni,edad);
        System.out.println(persona1.toString());
        
                
    }
    
}
