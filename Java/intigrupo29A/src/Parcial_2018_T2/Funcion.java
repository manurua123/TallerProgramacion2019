/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_2018_T2;

/**
 *
 * @author MANU
 */
public class Funcion {
    private String titulo;
    private String fecha;
    private int hora;
    private final Espectador [][] estructura = new Espectador [20] [10];
    int butacasOcupadas; 

    public Funcion(String titulo, String fecha, int hora) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.butacasOcupadas = 0; 
        int i,j;
        for (i=0; i<20; i++)
            for (j=0; j<10;j++)
                estructura[i][j] = new Espectador();    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean validarFila(int F){
        boolean aux = false;
        if (F < 20)
            aux = true;
        return aux; 
    }
    
    public boolean hayButacaLibreEnFila(int F){
        boolean aux = false;
        int j =0; 
        while ((j<20) &&  (estructura[F][j].getDni() != 0))
            j++;
        if (estructura[j][j].getDni() == 0){
            aux = true;
        }
        return aux;
    }
    
    public int agregarEspectadorAFila(int F, Espectador E){
        int j = 0;
        while ((j < 20) && (estructura[F][j].getDni() != 0))
            j++;
        estructura[F][j] = E; 
        butacasOcupadas ++; 
        return j; 
        }
    
    public int calcularButacasLibres (){
        int cant = 200 -  butacasOcupadas; 
        return cant;     
    }
    
    public double calcularEdadPromedioEspectador(){
         int i, j, cant;
         cant = 0;  

         for (i=0; i<20; i++)
            for (j=0; j<10;j++)
                if (estructura[j][j].getDni() != 0){
                    cant = cant + estructura[i][j].getEdad(); 
                }
        cant = cant/butacasOcupadas;
        return  cant; 
         
    }
    
    public boolean estaRegistradoEspectador(int D){
        int i, j; 
        boolean aux = false; 
        i= 0;
        j= 0; 
        while ( (i<20 ) && (D != estructura[i][j].getDni()) ){
            while ( (j<10 ) && (D != estructura[i][j].getDni() ))
                j++;    b
            i++;
            j=0;
        }
        if (estructura[j][j].getDni() == D)
            aux = true; 
        return aux; 
    }

 
    
    
    
}
