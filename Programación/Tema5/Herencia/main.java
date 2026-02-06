package Programación.Tema5.Herencia;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        
        Alumno juanito = new Alumno("juanito", "perez", LocalDate.of(2003, 2, 3), 50234565, "A",5.23);

        System.out.println(juanito);
        System.out.println(juanito.hashCode());
    }
}
