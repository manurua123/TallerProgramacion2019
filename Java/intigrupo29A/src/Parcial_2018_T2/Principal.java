/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_2018_T2;

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
        Funcion funcion = new Funcion("Cazafantasmas","22-10-2018",20);
        Espectador espectador = new Espectador();
        String nombre;
        int dni;
        int edad; 
        int fila = 0; 
        System.out.println("Ingrese el DNI del Espectador");
        dni = Lector.leerInt();
        if ((dni != 0) && (funcion.calcularButacasLibres()>0)){
            System.out.println("Ingrese el NOMBRE del Espectador");
            nombre= Lector.leerString();
            System.out.println("Ingrese la EDAD del Espectador");
            edad= Lector.leerInt();
            System.out.println("Ingrese la FILA deseada");
            fila= Lector.leerInt();
            espectador = new Espectador(nombre,dni,edad);
        }
        while ((dni != 0) && (funcion.calcularButacasLibres()>0)){
            if (funcion.validarFila(fila)== true){
                if (funcion.hayButacaLibreEnFila(fila) == true){
                    if(funcion.estaRegistradoEspectador(dni) == false)
                         System.out.println("Se agrego al espectador en la butaca " + funcion.agregarEspectadorAFila(fila,espectador));     
                    else 
                        System.out.println("El espectador ya se encuentra registrado");
                }
                else 
                    System.out.println("No hay butacas libre en la fila " + fila);
            }
            else 
                System.out.println("La fila seleccionada no es valida");
            
            System.out.println("Ingrese el DNI del Espectador");
            dni = Lector.leerInt();
            if ((dni != 0) && (funcion.calcularButacasLibres()>0)){
                System.out.println("Ingrese el NOMBRE del Espectador");
                nombre= Lector.leerString();
                System.out.println("Ingrese la EDAD del Espectador");
                edad= Lector.leerInt();
                System.out.println("Ingrese la FILA deseada");
                fila= Lector.leerInt();
                espectador = new Espectador(nombre,dni,edad);
            }   
        }
        System.out.println("La cantidad de butacas vacias es " + funcion.calcularButacasLibres());
        System.out.println("La edad promedio de los espectadores es " + funcion.calcularEdadPromedioEspectador() );
    }
    
}
