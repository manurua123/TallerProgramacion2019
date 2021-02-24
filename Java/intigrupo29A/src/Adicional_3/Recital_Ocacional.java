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
public class Recital_Ocacional extends Recital {
    private String motivo;
    private String contratador;
    private int dia; 

    public Recital_Ocacional(String motivo, String contratador, int dia, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.motivo = motivo;
        this.contratador = contratador;
        this.dia = dia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratador() {
        return contratador;
    }

    public void setContratador(String contratador) {
        this.contratador = contratador;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
    
    
    
}
