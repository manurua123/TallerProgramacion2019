/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.Lector;
public class Ej06Matrices {

    public static void main(String[] args) {
    int df = 10; int dc = 10;
    int [][] matriz = new int [df][dc];
    int pares = 0;
    int i,j;
    for (i = 0; i < df; i++){
        for (j = 0 ; j < dc; j++){
            matriz[i][j] = (pares++)*2 ;
            System.out.print(matriz[i][j] + " ");
        }
     System.out.println();
    }
    for (i = 2; i < 9; i++){
        for (j = 0 ; j < 3; j++){
            System.out.print(matriz[i][j] + " ");
        }
    System.out.println();
    }

    int tabla [];
    tabla =  new int [df];
    for (i = 0; i < df; i++){
        for (j = 0 ; j < dc; j++){
            tabla[j] = tabla[j]+ matriz[i][j];
        }
    System.out.println(tabla[i] + " ");
    }
    
    //5. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
    //   y en caso contrario imprima "No se encontró el elemento".
   // probar primero con dos fors anidados y un booleano, luego probar con whiles anidaddos
    }
}
