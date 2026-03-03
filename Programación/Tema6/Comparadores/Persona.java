/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programación.Tema6.Comparadores;

import java.time.LocalDate;

/**
 *
 * @author madrid
 */
public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNac;
    private double peso;
    private int altura;

    public Persona(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNac, double peso, int altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return dni + "\t" + nombre + "\t" + apellido1 + "\t" + apellido2 + "\t" + fechaNac + "\t" + peso + "\t" + altura + "\n";
    }

    @Override
    public int compareTo(Persona o) {
        int criterio = this.apellido1.compareToIgnoreCase(o.apellido1);
        
        if (criterio == 0){
            criterio = this.apellido2.compareToIgnoreCase(o.apellido2);
            if (criterio == 0){
                criterio = this.nombre.compareToIgnoreCase(o.nombre);
            }
        }
                
        return criterio;
    }
    
    
}
