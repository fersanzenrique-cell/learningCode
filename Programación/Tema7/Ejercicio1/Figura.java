package Programación.Tema7.Ejercicio1;

public abstract class Figura {
    private int id;
    private String color;
    private static int contador = 0;

    public Figura(String color){
        this.color = color;
        id = contador++;
        contador++;
    }
    public Figura(){
        this("#FFFFFF");
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static int getContador() {
        return contador;
    }
    public abstract double area();
    public abstract double perimetro();
}
