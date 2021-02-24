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
public class Urna_Electoral extends Urna{
    private int [] listas;
    private int cantListas;

    public Urna_Electoral(int u ,int l) {
        super(u, 0);
        cantListas= l; 
        this.listas = new int [l];
        int i;
        for (i=0; i < l; i++)
            listas[i] = 0;
    }
    
    public boolean validarNumeroDeLista (int n){
        boolean aux= false;
        if(n< cantListas)
            aux = true;
        return aux;    
    }
    
    public void votarPorLista(int i){
        listas[i]++;
    }
    
    public int devolverVotosPorLista(int i){
        return listas[i];   
    }
    
    public int calcularGanador (){
        int max = -1;
        int listaMax = 0; 
        int i;
        for (i=0; i < cantListas; i ++)
            if (listas[i]>max){
                max= listas[i];
                listaMax = i; 
            }
        return listaMax;     
    }
    
    public int calcularTotalVotos(){
        int i;
        int cant = 0;
        for (i=0; i< cantListas; i++){
            cant = cant + listas[i];
        }
        cant = cant + this.getVotosBlanco();
        return cant; 
    }
    
    
    
    
    
    
    
}
