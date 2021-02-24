
package tema3;

import PaqueteLectura.Lector;
public class ejercicio3 {

    public static void main(String[] args) {
        String nombre;
        int campeonatos;
        double sueldoMinimo;
        
        System.out.println("ingrese el Nombre del Entrenador");
        nombre = Lector.leerString();
        //entrenador1.setNombre(nombre);
        System.out.println("ingrese el Sueldo Minimo del Entrenador");
        sueldoMinimo = Lector.leerDouble();
        //entrenador1.setSueldoMinimo(sueldoMinimo);
        System.out.println("ingrese los Campeonatos ganados por el Entrenador");
        campeonatos = Lector.leerInt();
        //entrenador1.setCampeonatos(campeonatos);
        
        Entrenadores entrenador1 = new Entrenadores(nombre,campeonatos,sueldoMinimo); 
        
        System.out.println(entrenador1.toString());
        System.out.println("El sueldo total del Entrenador es $" + entrenador1.calcularSueldoAcobrar());  
       
   }
    
}
