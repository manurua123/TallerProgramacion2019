/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional_2;

/**
 *
 * @author MANU
 */
public class Urna {
    private int numeroUrna;
    private int votosBlanco;

    public Urna(int numeroUrna, int votosBlanco) {
        this.numeroUrna = numeroUrna;
        this.votosBlanco = votosBlanco;
    }

    public int getNumeroUrna() {
        return numeroUrna;
    }

    public void setNumeroUrna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }
    
    public void votarBlanco (){
        votosBlanco ++;
    }
    
    
}
