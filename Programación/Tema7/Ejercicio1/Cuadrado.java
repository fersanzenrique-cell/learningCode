package Programación.Tema7.Ejercicio1;

public class Cuadrado extends Figura{
    private double lado;
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }
    @Override
    public double perimetro() {
        return lado*4;
    }
}
