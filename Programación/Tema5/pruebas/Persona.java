package Programación.Tema5.pruebas;

import java.time.LocalDate;

public class Persona {
    // atributos de objetos, para objetos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int dni = 0;

    // los atributos de clase son siempre static y por nomenclatura en mayusculas.
    // atributos de clase para informacion comun
    private static int NUM_PERSONAS = 0;
    private static final String[][] LETRA_DNI = new String[2][22];
    // hazlo tambien con el string de dos dimensiones
    // final es inmodificable
    private static final String STRING_LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    Persona(String nombre, String apellidos, LocalDate fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        NUM_PERSONAS++;
    }
    /* 
    Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        NUM_PERSONAS++;
    }
    */
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this(nombre, apellidos, fechaNacimiento, 0);
        NUM_PERSONAS++;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    // static, no se necesita una instancia de objeto para utilizar
    public static int getNUM_PERSONAS() {
        return NUM_PERSONAS;
    }
    public static String getSTRING_LETRAS_DNI() {
        return STRING_LETRAS_DNI;
    }
    // hacer que lanze una excepcion creada
    public char calcularLetra () {
        char letra = '\0';
        if (this.dni != 0) {
            int resto = dni%23;
            letra = STRING_LETRAS_DNI.charAt(resto);
        }
        return letra;
    }

    @Override
    public String toString() {
        return String.valueOf(getDni())+calcularLetra();
    }

}
