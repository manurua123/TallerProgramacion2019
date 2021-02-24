/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional_3;

/**
 *
 * @author MANU
 */
public class Recital {
   private String nombreBanda;
   private String [] listaTemas;
   private int cantTemas; 

    public Recital(String nombreBanda, int cantTemas) {
        this.nombreBanda = nombreBanda;
        this.cantTemas = cantTemas;
        this.listaTemas = new String [cantTemas];
        int i; 
        for(i=0; i<cantTemas; i++)
            listaTemas[i]="";
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }
    
    public void agregarTema(String nombreTema, int i){
        listaTemas[i]=nombreTema; 
    }
    public String actuarRecital(int i){
        String aux;
        aux = "y ahora tocaremos " + listaTemas[i];
        return (aux); 
    }
    
}
    
   
   
   
    

