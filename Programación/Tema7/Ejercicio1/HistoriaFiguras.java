package Programación.Tema7.Ejercicio1;

import java.util.ArrayList;

public class HistoriaFiguras {
    public static void main(String[] args) {
       ArrayList<Figura> lista = new ArrayList<>();
       lista.add(new Triangulo("verde", 20, 30));
       lista.add(new Cuadrado("rojo", 15));
       lista.add(new Circulo("amarillo", 20));
       for (Figura elemento : lista) {
           System.out.println(elemento.area() + " " +  elemento.perimetro()); 
       }
    }
}
