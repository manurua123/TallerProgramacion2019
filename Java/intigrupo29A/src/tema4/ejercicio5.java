package tema4;
import PaqueteLectura.Lector;
public class ejercicio5 {

    public static void main(String[] args) {
        Flota flota1 = new Flota ();  //genera una flota vacia
        String patente;
        String destino = ""; 
        int horario = 0;
        
        System.out.println("Ingrese la patente del micro" );
        patente=Lector.leerString();
        if (!"ZZZ000".equals(patente)){
            System.out.println("Ingrese el destino del micro" );
            destino=Lector.leerString();
            System.out.println("Ingrese el horario del micro" );
            horario=Lector.leerInt();
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-." );
        }
        int i = 0;
        while (!"ZZZ000".equals(patente) && (flota1.getCantidadMicros()!=14)){
            flota1.agregarMicro(patente, destino, horario, i);
            System.out.println("Ingrese la patente del micro" );
            patente=Lector.leerString();
            if (!"ZZZ000".equals(patente)){
                System.out.println("Ingrese el destino del micro" );
                destino=Lector.leerString();
                System.out.println("Ingrese el horario del micro" );
                horario=Lector.leerInt();
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-." );
                i++;
            }           
        }
        System.out.println("");
        
        System.out.println("Ingrese la patente que desea buscar:");
        String patenteBuscada;
        patenteBuscada = Lector.leerString();
        if (flota1.eliminarMicro(patenteBuscada) == true )
            System.out.println("Se encontro y elimino el Micro buscado"); 
        else
            System.out.println("NO SE ENCONTRO EL MICRO BUSCADO");
        
        System.out.println("");
        
        System.out.println("Ingrese el destino que desea buscar:");
        String destinoBuscada;
        destinoBuscada = Lector.leerString(); 
        if (flota1.buscarDestino(destinoBuscada).getSalida()!= 0)
            System.out.println("Se encontro el micro con patente " + flota1.buscarDestino(destinoBuscada).getPatente() + " y sale a las " + flota1.buscarDestino(destinoBuscada).getSalida());
        else
            System.out.println("NO SE ENCONTRO EL MICRO BUSCADO");
            
       
        
        
    }
    
}
