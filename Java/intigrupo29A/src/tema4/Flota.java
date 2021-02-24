
package tema4;
public class Flota {
    private final Micro [] vectorMicros;
    private int cantidadMicros;
    
   // genera una flota sin micros
    public Flota(){
        vectorMicros = new Micro [15];
        cantidadMicros = 0;  
    }
    
    //retorna la cantidad de micros de la flota
    public int getCantidadMicros(){
        return cantidadMicros;
    }

    //devolver estado de la flota. True si esta completa o False si no esta completa
    public boolean flotaCompleta (){
        boolean aux = false;
        if(cantidadMicros == 15)
            aux = true;
        return aux;      
    }
    
    //Ingresa un micro en la posicion i
    public void agregarMicro(String patenteLeida,String destinoLeido, int salidaLeida, int i){
      vectorMicros[i] = new Micro(patenteLeida,destinoLeido,salidaLeida);
      cantidadMicros ++; 
    }
    
    //Elimina un micro con patente = patenteBuscada  
    public boolean eliminarMicro(String patenteBuscada){
        boolean aux = false; 
        int i=0;
        while ((i<cantidadMicros)&&(!vectorMicros[i].getPatente().equals(patenteBuscada)))
            i++;
        if (vectorMicros[i].getPatente().equals(patenteBuscada)){
            vectorMicros[i] = new Micro(); 
            aux = true;
            cantidadMicros --;
        }
        return aux; 
    }
    
    //busca un micro con patente = patenteoBuscado. Retorna un micro vacio o si encuentra retorna el micro con el patenteoBuscado
    public Micro buscarPatente(String patenteBuscada){
        Micro aux = new Micro();
        int i=0;
        while ((i<cantidadMicros)&& (!vectorMicros[i].getPatente().equals(patenteBuscada)))
            i++;        
        if (vectorMicros[i].getPatente().equals(patenteBuscada))
            aux = vectorMicros[i];
        return aux;          
    }
    
    //busca un micro con destino = destinoBuscado. Retorna un micro vacio o si encuentra retorna el micro con el destinoBuscado
    public Micro buscarDestino(String destinoBuscada){
        Micro aux = new Micro();
        int i=0;
        while ((i<cantidadMicros)&& (!vectorMicros[i].getDestino().equals(destinoBuscada)))
            i++;        
        if (vectorMicros[i].getDestino().equals(destinoBuscada))
            aux = vectorMicros[i];
        return aux;          
    }       
  }
    

