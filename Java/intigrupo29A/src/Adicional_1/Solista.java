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
public class Solista {
    private String nombre;
    private String instrumento;
    private int cantTemas;

    public Solista(String nombre, String instrumento, int cantTemas) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.cantTemas = cantTemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }       
}
