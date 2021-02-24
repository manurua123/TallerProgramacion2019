
package tema3;

public class Entrenadores {
    private String nombre;
    private double sueldoMinimo;
    private int campeonatos;
    private double sueldoTotal;
    
    public Entrenadores(String nombreLeido,int campeonatosGanados,double sueldo){
      nombre=nombreLeido;
      sueldoMinimo=sueldo;
      campeonatos=campeonatosGanados;
    }
    
    public String getNombre (){
        return nombre;
}
    public double getSueldoMinimo (){
        return sueldoMinimo;
}
    public int getCampeonatos (){
        return campeonatos;
}


    public void  setNombre (String elNombre){
     nombre = elNombre;
}
    public void  setSueldoMinimo (double elSueldoMinimo){
     sueldoMinimo = elSueldoMinimo;
}
    public void  setCampeonatos(int elCampeonatos){
    campeonatos = elCampeonatos;
}
    
public double calcularSueldoAcobrar() {
    if((campeonatos<5) && (campeonatos>0)){
        sueldoTotal=sueldoMinimo + 5000;
        return sueldoTotal;
    }
    if((campeonatos<10)&&(campeonatos > 4)){
        sueldoTotal=sueldoMinimo + 10000;
        return sueldoTotal;
    }
    if(campeonatos>10){
        sueldoTotal=sueldoMinimo + 30000;
        return sueldoTotal;
    }
        return sueldoMinimo;
}
public String toString (){
    String aux;
    aux =( "El entrenador " + nombre + " gano " + campeonatos +" campeonatos y su sueldo minimo es $" + sueldoMinimo);
    return aux; 
}
}



