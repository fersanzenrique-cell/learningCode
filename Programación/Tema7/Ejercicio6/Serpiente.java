package Programación.Tema7.Ejercicio6;

import java.time.LocalDate;

public class Serpiente extends AnimalTerrestre {
    private static final String huella="S";
    private static final double VELOCIDAD = 4.16;

    public Serpiente(String nombre, LocalDate fechaNacimiento) {
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
