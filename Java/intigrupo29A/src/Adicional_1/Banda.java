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
public class Banda {
    private String nombre;
    private String ciudad;
    private int cantIntegrantes;

    public Banda(String nombre, String ciudad, int cantIntegrantes) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.cantIntegrantes = cantIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantIntegrantes() {
        return cantIntegrantes;
    }

    public void setCantIntegrantes(int cantIntegrantes) {
        this.cantIntegrantes = cantIntegrantes;
    }
    
    
    
}


