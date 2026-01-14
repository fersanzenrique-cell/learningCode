package Ejercicioedad;

import java.time.LocalDate;

public class Persona {
    private String nombre, apellidos;
    private LocalDate fechanacimiento;
    private float ingresosAnuales;

    public Persona(String nombre, String apellidos, LocalDate fechanacimiento, float ingresosanuales) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.ingresosAnuales = ingresosanuales;
    }

    public Persona(String nombre, String apellidos, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
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
    public float getIngresosanuales() {
        return ingresosAnuales;
    }
    public void setIngresosanuales(float ingresosanuales) {
        this.ingresosAnuales = ingresosanuales;
    }
    public int edad(){
        // tambien se puede hacer asi
        // int edad = Period.between(fechanacimiento,hoy).getYears();
        return LocalDate.now().compareTo(fechanacimiento);
    }
    public boolean mayorEdad() {
        return edad() >= 18; //Manera simplicificada sin if y else
    }
    public String mayorEdadtoString(){
        if (mayorEdad()) {
            return "Eres mayor de edad";
        }
        else {
            return "No eres mayor de edad";
        }
    }
    public double impuestos() {
        double impuesto = 0;

        if (ingresosAnuales < 85528) {
            impuesto = ((ingresosAnuales * 18) / 100) - 556.2;
        } else {
            impuesto = 14839.02 + (((ingresosAnuales - 85528) * 32) / 100);
        }

        if (impuesto < 0) {
            impuesto = 0.0;
        }
        return Math.round(impuesto);
    }
}
