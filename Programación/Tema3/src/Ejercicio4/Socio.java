package Ejercicio4;

public class Socio {
    private String nombre;
    private int edad;
    private boolean padresSocios;
    // atributo estático
    private static int contador = 0;

    public Socio(String nombre,int edad, boolean padresSocios) {
        this.nombre = nombre;
        this.edad = edad;
        this.padresSocios = padresSocios;
        contador++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isPadresSocios() {
        return padresSocios;
    }
    public void setPadresSocios(boolean padresSocios) {
        this.padresSocios = padresSocios;
    }

    public double cuota() {
        double cuota = 800;
        if (edad > 65 ) {
            cuota -= cuota * 0.4;
        } if (edad < 21 ) {
                cuota -= cuota * 0.25;
        }

        if (padresSocios) {
            return cuota -= cuota * 0.45;
        } else {
            return cuota;
        }

    }
    public static int contadorSocios() {
        return contador;
    }

}
