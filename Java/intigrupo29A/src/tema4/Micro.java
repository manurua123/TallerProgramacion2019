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
public class Micro {
    private String patente;
    private String destino;
    private int salida;
    private int asientosOcupados; 
    private boolean [] asiento;
    
    
    
    public String getPatente (){
        return patente;
    }
    public String getDestino(){
        return destino;
    }
    public int getSalida(){
        return salida;
    }
    
    public void setPatente(String patenteLeida){
        patente=patenteLeida;
    }
    public void setDestino(String destinoLeido){
        destino = destinoLeido;
    }
    public void setSalida(int horario){
        salida=horario;
    }
    
    public Micro(String patenteLeida,String destinoLeido, int salidaLeida){
        patente=patenteLeida;
        destino=destinoLeido;
        salida=salidaLeida;
        asientosOcupados = 0;
        asiento = new boolean [20];
        int i;
        for (i=0; i<20; i++)
            asiento[i] = false;   
    }
    public Micro(){
        patente="";
        destino="";
        salida= 0;
        asientosOcupados = 0;
        asiento = new boolean [20];
        int i;
        for (i=0; i<20; i++)
            asiento[i] = false;  
        
    }
    
    public String toString (){
        String aux;
        aux = ("El micro con patente " + patente + " tiene destino " + destino + " y sale a las " + salida);
        return aux; 
    }
    
    public int getAsientosOcupados (){
        return asientosOcupados;
    }
    
    public boolean MicroLLeno(){
        boolean aux;
        aux = false;
        if (asientosOcupados == 19)
            aux = true;
        return aux;    
    }
    
    public boolean validaAsiento(int nroAsiento){
     boolean aux=false;
     if (nroAsiento<20)
       aux=true;
     return aux;
    }
    public boolean estadoDeAsiento(int asientoLeido){
        return asiento[asientoLeido];
    }
    public void ocuparAsiento(int asientoLeido){
        if((asiento[asientoLeido]==false)&&(asientoLeido<20)){
            asiento[asientoLeido]=true;
            asientosOcupados ++;
        }
    }
     public void liberarAsiento(int asientoLeido){
        if((asiento[asientoLeido]==true)&&(asientoLeido<20)){
            asiento[asientoLeido]=false;
            asientosOcupados --;
        }
    }
     public int primerAsiento(){
         int i=0;
       while((asiento[i]==true)&&(i<20))
           i++;
       if(asiento[i]==true)
           return -1;
       return i;
     }

    

    
}
