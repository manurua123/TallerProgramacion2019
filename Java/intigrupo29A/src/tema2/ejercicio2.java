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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona [] vectorPersonas = new Persona [2];
        int i;
        for (i=0;i<2;i++){
        System.out.println("Ingrese nombre");
        String nombre = Lector.leerString();
        System.out.println("Ingrese DNI");
        int dni = Lector.leerInt();
        System.out.println("Ingrese edad");
        int edad = Lector.leerInt();
        
        Persona persona1 = new Persona (nombre,dni,edad);
        vectorPersonas[i]=persona1; 
        }
        int cant=0;
        int min = 99999999;
        int personaMin = 1; 
        for (i=0;i<2;i++){
            System.out.println(vectorPersonas[i].toString());
            if(vectorPersonas[i].getEdad()>65)
                cant++;
            if (vectorPersonas[i].getDNI()< min){
                min = vectorPersonas[i].getDNI(); 
                personaMin= i;
        }
         }
         System.out.println("la cantidad de personas mayores de 65 años son: " + cant);
         System.out.println("La persona con el dni mas chico es: " + vectorPersonas[personaMin].getNombre());
         
         
         
         
        
    }
    
}
