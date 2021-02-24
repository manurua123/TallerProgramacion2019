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
public class Gira extends Recital {
    private String nombre;
    private String [] listaCiudades;
    private int cantFechas; 
    private String ciudadActual;
    private int diaActual; 

    public Gira(String nombre, int cantFechas, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.nombre = nombre;
        this.listaCiudades = new String [cantFechas];
        this.cantFechas = cantFechas;
        this.ciudadActual = "";
        this.diaActual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantFechas() {
        return cantFechas;
    }

    public void setCantFechas(int cantFechas) {
        this.cantFechas = cantFechas;
    }

    public String getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(String ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public int getDiaActual() {
        return diaActual;
    }

    public void setDiaActual(int diaActual) {
        this.diaActual = diaActual;
    }
    
    
    public void agregarFecha()
    
    

    
    
    
    
    
}
