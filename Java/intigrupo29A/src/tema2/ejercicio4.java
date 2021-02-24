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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [][] matriz = new Persona[5][8];
        int i;
        int j; 
       
        int dni =-1;
        String nombre; 
        int edad = -1;
        for (i=0;i<5; i++){
             
            System.out.println("Ingrese nombre");
            nombre = Lector.leerString();
            if (!nombre.equals( "zzz")) {
                System.out.println("Ingrese DNI");
                dni = Lector.leerInt();
                System.out.println("Ingrese edad");
                edad = Lector.leerInt();
            }
            j=0;
            while((!nombre.equals( "zzz"))&&(j<8)){
                Persona persona1 = new Persona (nombre,dni,edad);
                matriz [i][j] = persona1; 
                j++;
               
                System.out.println("Ingrese nombre");
                nombre = Lector.leerString();
                if (!nombre.equals( "zzz")) {
                    System.out.println("Ingrese DNI");
                    dni = Lector.leerInt();
                    System.out.println("Ingrese edad");
                    edad = Lector.leerInt();
                }
            }
        }
        
        for (i=0; i<5; i++){
            j=0;
            while (!matriz[i][j].getNombre().equals("zzz")){
                System.out.println("Particiapante:" + matriz[i][j].toString());
                j++;
             }
        }
        
    }
    
}
