package Programación.Tema5.pruebas;

public class TestRectangulo {
    public static void main(String[] args) {
        /* 
        Rectangulo r1 = new Rectangulo(40,40);
        Rectangulo r2 = new Rectangulo(2,4,10,23);
        Rectangulo r3 = new Rectangulo();
        Rectangulo r4 = new Rectangulo(r2);

        System.out.println(r1);
        System.out.println(r2);
        */

        Punto p1 = new Punto(4,5);
        Punto p2 = new Punto(20,30);

        Rectangulo2 r5 = new Rectangulo2(p1 , p2);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(r5);

        p2.setY(20);
        System.out.println(r5);
    }
}
