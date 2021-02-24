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
public class Urna_Referendum extends Urna{
    private int votosSi;
    private int votosNo; 

    public Urna_Referendum(int numeroUrna) {
        super(numeroUrna, 0);
        this.votosSi = 0;
        this.votosNo = 0;
    }

    public int getVotosSi() {
        return votosSi;
    }

    public int getVotosNo() {
        return votosNo;
    }

    
    
    public void votoAFavor(){
        votosSi ++ ;
    }
    
    public void votoEnContra(){
        votosNo ++;
    }
    
    public int calcularGanador(){
        int aux = -1; 
        if( votosSi > votosNo)
            aux = 1;
        if (votosNo > votosSi)
            aux = 0;
        return aux;
    }
    
    
    public int calularTotalVotos (){
        int aux = votosSi + votosNo + this.getVotosBlanco();
        return aux; 
    }
    
    
    
    
}
