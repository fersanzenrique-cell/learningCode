/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Programación.Tema7.Ejercicio6;

/**
 *
 * @author Víctor Rodríguez Guio
 */

public abstract class VehiculoJuguete implements Corredor {
    private String nombre;
    private String marca;
    private double desplazamiento;

    public VehiculoJuguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(double desp) {
        this.desplazamiento = desp;
    }
    
}
