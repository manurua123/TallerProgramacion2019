/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional_1;

/**
 *
 * @author MANU
 */
public class Discografica {
    private String nombre;
    private String ciudad;
    private String nombreDueño;
    private Solista [] vectorSolista;
    private Banda [] vectorBanda;
    private int cantSolista;
    private int cantBanda;

    public Discografica(String nombre, String ciudad, String nombreDueño) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombreDueño = nombreDueño;
        this.vectorSolista = new Solista [50];
        this.vectorBanda = new Banda [50];
        this.cantSolista = 0;
        this.cantBanda = 0;
    }
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getCantSolista() {
        return cantSolista;
    }

    public void setCantSolista(int cantSolista) {
        this.cantSolista = cantSolista;
    }

    public int getCantBanda() {
        return cantBanda;
    }

    public void setCantBanda(int cantBanda) {
        this.cantBanda = cantBanda;
    }
 
    
    public void agregarBanda(String nombre, String ciudad, int cantIntegrantes,int i){
        vectorBanda[i]= new Banda(nombre,ciudad,cantIntegrantes);
        cantBanda ++;
    }
    
    public void agregarSolista(String nombre, String instrumento, int cantTemas,int i){
        vectorBanda[i]= new Banda(nombre,instrumento,cantTemas);  
        cantSolista ++;
    }
    
    public int buscarInstrumento(String instrumentoBuscado){
        int i;
        int aux = 0; 
        for (i=0; i<cantSolista; i++){
            if (vectorSolista[i].getInstrumento().equals(instrumentoBuscado))
                aux ++;
        }
        return aux; 
    }
    
    public String bandaMax(){
        int max = 0; 
        String aux = "vacio";
        int i;
        for (i=0; i <cantBanda; i++){
            if (vectorBanda[i].getCantIntegrantes()> max){
                max = vectorBanda[i].getCantIntegrantes();
                aux = vectorBanda[i].getNombre();
            }    
        }
        return aux; 
    }
    
    public int mismaCiudad (){
        int i; 
        int aux = 0; 
        for (i=0; i < cantBanda; i++){
            if (vectorBanda[i].getCiudad().equals(ciudad))
                aux ++;
        }
        return aux;
    }
   
    
    
    
}
