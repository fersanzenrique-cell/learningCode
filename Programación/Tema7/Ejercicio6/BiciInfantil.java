/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Programación.Tema7.Ejercicio6;

/**
 *
 * @author Víctor Rodríguez Guio
 */
public class BiciInfantil extends VehiculoJuguete{

    public BiciInfantil(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public void correr() {
        this.setDesplazamiento(this.getDesplazamiento()+2.5);
    }
    @Override
    public String huella() {
        double estado = Math.floor(this.getDesplazamiento());
        
        return "-".repeat((int) estado);
    }

}
