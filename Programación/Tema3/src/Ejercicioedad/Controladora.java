package Ejercicioedad;

import java.time.LocalDate;

public class Controladora {
    public static void main(String[] args) {
        Persona nino = new Persona("Felipe","Rey", LocalDate.of(2015,10,9));
        System.out.println(nino.edad());
        System.out.println(nino.mayorEdad());
        System.out.println(nino.mayorEdadtoString());
        Persona adulto = new Persona("Jóse", "Blazquez", LocalDate.of(2003,8,21),-100);
        System.out.println(adulto.impuestos());
    }
}
