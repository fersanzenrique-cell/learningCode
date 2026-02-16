package Programación.Tema5.Ejercicio5;

import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // Runtime analiza la memoria usadad
        ArrayList <Object> objetos = new ArrayList<>();
        objetos.add(new M(0));
        objetos.add(new A(2,5));
        objetos.add(new B(2,10));
        objetos.add(new C(3,20,50));

        System.out.println(objetos.toArray());

        for (Object objeto : objetos) {
            System.out.println(objeto.toString());
        }
    }
    

}
