/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Programación.Tema7.Ejercicio6;

/**
 *
 * @author Víctor Rodríguez Guio
 */
public class CocheTele extends VehiculoJuguete{

    public CocheTele(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public void correr() {
        this.setDesplazamiento(this.getDesplazamiento()+1.2);
    }
    @Override
    public String huella() {
        double estado = Math.floor(this.getDesplazamiento());
        
        return "=".repeat((int) estado);
    }
}
