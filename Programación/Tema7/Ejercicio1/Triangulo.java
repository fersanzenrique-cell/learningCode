package Programación.Tema7.Ejercicio1;

public class Triangulo extends Figura{
    // asumimos que es equilatero
    private double base;
    private double altura;
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    // getters y setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return (base*altura)/2;
    }
    @Override
    public double perimetro() {
        double lado = Math.sqrt((4*area())/Math.sqrt(3));
        return lado*3;
    }
}
