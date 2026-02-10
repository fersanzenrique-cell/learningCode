package Programación.Tema5.Ejercicio3;

public class Profesor {
    private String nombre;
    private int edad;
    private int yearsConsolidados;

    public Profesor (String nombre, int edad, int yearsConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.yearsConsolidados = yearsConsolidados;
    } 

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getYearsConsolidados() {
        return yearsConsolidados;
    }
    public void setYearsConsolidados(int yearsConsolidados) {
        this.yearsConsolidados = yearsConsolidados;
    }

    public double obtenerSalarioBase () {
        return 1500 + 60 * getYearsConsolidados();
    }

}
