package Programación.Tema5.pruebas;

import java.time.LocalDate;

public class TestPersona {
    public static void main(String[] args) {
        Persona elpepe = new Persona("pepe", "aragon", LocalDate.of(2003, 12, 22),1234573);
        //Hacen lo mismo
        System.out.println(elpepe);
        System.out.println(elpepe.toString());

        System.out.println(Persona.getNUM_PERSONAS());
        System.out.println(elpepe.calcularLetra());
    }
}
