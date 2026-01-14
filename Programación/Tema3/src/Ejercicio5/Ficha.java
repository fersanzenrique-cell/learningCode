package Ejercicio5;

public class Ficha {
    private int posicion;
    public Ficha() {
        this.posicion = 0;
    }
    public Ficha(int posicion) {
        this.posicion = posicion;
    }
    public int getPosicion() {
        return posicion;
    }
    public int avanzar() {
        return ++posicion;
    }
    public int retroceder() {
        return --posicion;
    }
    public int saltar(int num) {
        return posicion += num;
    }
    public int ir(int pos) {
        return posicion = pos;
    }
    public String toString() {
        return "" + posicion;
    }
    public void lineaPogreso() {
        for (int i = 0; i <= posicion; i++) {
            System.out.print("-");
            System.out.print((i==posicion)?"/" + posicion + "/->":" ");

        }
        System.out.println("\nPosición " + posicion);
    }
}
