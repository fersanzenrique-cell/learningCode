package Ejercicio3;

public class Coche {
    //atributos
    String color;
    String marca;
    String modelo;
    int cilindrada;
    Boolean estadocoche;
    //constructor
    Coche(String color,String marca){
        this.color = color;
        this.marca = marca;
    }
    //metodos
    void encender() {
        System.out.println("Arrancando");
    } //void, metodo que no devuelve nada
    void acelerar() {
        System.out.println("Acelerando");
    }
    void frenar() {
        System.out.println("Frenando");
    }
    void imprimirmodeloymarca() {
        System.out.println(modelo + " y " + marca);
    }
    void estadocoche() {
        if (estadocoche) {
            System.out.println("Coche arrancado");
        } else {
            System.out.println("Coche no arrancado");
        }
    }
}
