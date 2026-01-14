package Ejercicio6;

import java.time.LocalDate;

public class Persona {
    private String nombre, apellidos;
    private LocalDate fechanacimiento;
    private int altura;
    private float ingresosanuales;


    public Persona(String nombre, String apellidos, LocalDate fechanacimiento,int altura, float ingresosanuales) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.altura = altura;
        this.ingresosanuales = ingresosanuales;
    }

    public Persona(String nombre, String apellidos, LocalDate fechanacimiento,int altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }
    public int getAltura() {
        return altura;
    }
    public float getIngresosanuales() {
        return ingresosanuales;
    }
    public void setIngresosanuales(float ingresosanuales) {
        this.ingresosanuales = ingresosanuales;
    }
    public int edad(){
        // tambien se puede hacer asi
        return LocalDate.now().compareTo(fechanacimiento);
    }
    public boolean mayorEdad() {
        return edad() > 18; //Manera simplicificada sin if y else
    }
    public String mayorEdadtoString(){
        if (mayorEdad()) {
            return "Eres mayor de edad";
        }
        else {
            return "No eres mayor de edad";
        }
    }
}