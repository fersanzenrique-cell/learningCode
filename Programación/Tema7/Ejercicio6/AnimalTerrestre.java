package Programación.Tema7.Ejercicio6;
import java.time.LocalDate;

public abstract class AnimalTerrestre implements Corredor{
    private String nombre;
    private LocalDate fechaNacimiento;
    private double desplazamiento;

    public AnimalTerrestre(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public double getDesplazamiento() {
        return desplazamiento;
    }
    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }
    public abstract void correr();
    public abstract String huella();


}
