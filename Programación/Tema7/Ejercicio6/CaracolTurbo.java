package Programación.Tema7.Ejercicio6;

import java.time.LocalDate;

public class CaracolTurbo extends AnimalTerrestre {
    private static final String huella="_";
    private static final double VELOCIDAD = 1;

    public CaracolTurbo(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public void correr() {
    setDesplazamiento(getDesplazamiento() + VELOCIDAD);
    }
    @Override
    public String huella() {
        String rastro= "";
        for (int i = 0; i < getDesplazamiento(); i++) {
            rastro = rastro + huella;
        }
        return rastro;
    }



}
