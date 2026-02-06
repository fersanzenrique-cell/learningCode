package Programación.Tema5.Herencia;

import java.time.LocalDate;

public class Alumno extends Persona {
    
    private String grupo;
    private double notaMedia;
    
    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, int dni, String grupo, double notaMedia) {

        super(nombre, apellidos, fechaNacimiento, dni);
        this.grupo = grupo;
        this.notaMedia = notaMedia;

    }
    public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String grupo, double notaMedia) {

        super(nombre, apellidos, fechaNacimiento);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
        
    }
}
