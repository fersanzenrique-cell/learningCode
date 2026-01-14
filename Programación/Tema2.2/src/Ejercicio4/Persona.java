package Ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private double peso;
    private int altura;

    Persona(String nombre,LocalDate nacimiento, double peso, int altura) {
        this.nombre = nombre;
        this.fechaNacimiento = nacimiento;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getNacimiento() {
        return fechaNacimiento;
    }
    public double getPeso() {
        return peso;
    }
    public int getAltura() {
        return altura;
    }
    public int edad() {
        int fechaFinal = LocalDate.now().getYear();
        int intFechaNacimiento = fechaNacimiento.getYear();
        return fechaFinal- intFechaNacimiento;
    }
    //
    public void setNombre(String nombre) {
        if (nombre.length() > 0)
            this.nombre = nombre;

    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setAltura (int altura) {
        if (altura > 0)
            this.altura=altura;
    }
    public void setPeso (double peso) {
        if (peso > 0)
            this.peso=peso;
    }
}
