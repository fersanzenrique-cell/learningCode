package Ejercicio5;

public class Juego {
    public static void main(String[] args) {
        Ficha f0 = new Ficha(5);
        f0.avanzar();
        f0.avanzar();
        f0.retroceder();
        System.out.println(f0.getPosicion());
        f0.ir(10);
        System.out.println(f0.getPosicion());
        f0.saltar(2);
        System.out.println(f0.getPosicion());
        f0.retroceder();
        System.out.println(f0.getPosicion());
        f0.toString();
        f0.lineaPogreso();
        f0.ir(30);
        f0.lineaPogreso();
    }
}
