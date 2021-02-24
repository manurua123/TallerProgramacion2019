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
import PaqueteLectura.Lector;
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Urna_Electoral urnaE = new Urna_Electoral(203,5);
        Urna_Referendum urnaR = new Urna_Referendum(203);
        int dni;
        int lista; 
        int referendum;
        
        System.out.println("Ingrese su DNI");
        dni = Lector.leerInt();
        while (dni != 0){
            System.out.println("");
            System.out.println("URNA ELECTORAL");
            System.out.println("Ingrese la lista que decea votar");
            lista = Lector.leerInt();
            if (urnaE.validarNumeroDeLista(lista)== true)
                urnaE.votarPorLista(lista);
            else 
                urnaE.votarBlanco();
            
            System.out.println("");
            System.out.println("URNA REFERENDUM");
            System.out.println("1 = SI \n-1 = NO \n0 = VOTO EN BLANCO");
            
            referendum = Lector.leerInt();
            if (referendum > 0)
               urnaR.votoAFavor();
            if (referendum < 0)
                urnaR.votoEnContra();
            if (referendum == 0)
                urnaR.votarBlanco();
            
            System.out.println(".,.,.,.,.,.,.,.,.,");
            System.out.println("Ingrese su DNI");
            dni = Lector.leerInt();        
        }
         System.out.println("////////////////////////////////");
        System.out.println("RESULTADOS ELECCIONES:");
        double porcentajeE; 
        double porcentajeR;
        porcentajeE = ( urnaE.devolverVotosPorLista(urnaE.calcularGanador())* 100 / urnaE.calcularTotalVotos()); 
        System.out.println("LA LISTA GANADORES ES LA LISTA " + urnaE.calcularGanador()+ " CON EL   " + porcentajeE + "% DE LOS VOTOS");
        System.out.println("REFERENDUM");
        if (urnaR.calcularGanador() == 1 ){
            porcentajeR = (urnaR.getVotosSi()* 100 / urnaR.calularTotalVotos());
            System.out.println("GANO EL SI  CON EL " + porcentajeR +"% DE LOS VOTOS");
        }
        if (urnaR.calcularGanador() == 0 ){
            porcentajeR = (urnaR.getVotosNo()* 100 / urnaR.calularTotalVotos());
            System.out.println("GANO EL NO  CON EL " + porcentajeR +"% DE LOS VOTOS");
        }
        if (urnaR.calcularGanador() == -1 )
            System.out.println("HUBO EMPATE");   
    }
    
}
