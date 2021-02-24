/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

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
      int asiento;
      Micro micro1 = new Micro ("ABC123","Mar del Plata", 5);
      System.out.println("ingrese el numero de asiento" );
      asiento=Lector.leerInt();
      while (asiento > 19){
           System.out.println("--- EL NUMERO INGRESADO NO ES VALIDO--" );
           System.out.println("ingrese otro numero de asiento valido" );
           asiento=Lector.leerInt();    
      }
      while((asiento < 20)&&(asiento != -1)){
          micro1.validaAsiento(asiento);
         
         if(micro1.estadoDeAsiento(asiento)==false){
            micro1.ocuparAsiento(asiento);
            System.out.println("la operacion ah sido exitosa" );
         }
            else{
                System.out.println("la operacion no se pudo realizar, el asiento esta ocupado" );
                System.out.println(".,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,");
                System.out.println("el primer asiento desocupado es " + micro1.primerAsiento() );
                }
          System.out.println("----------------------------------");
          System.out.println("Ingrese el numero de asiento" );
           asiento=Lector.leerInt();
          while (asiento > 19){
           System.out.println("--- EL NUMERO INGRESADO NO ES VALIDO--" );
           System.out.println("ingrese otro numero de asiento valido" );
           asiento=Lector.leerInt();    
      }
         
         
      }
       System.out.println("La cantidad de asientos ocupados es "+ micro1.getAsientosOcupados() );
      
    }
    
}
