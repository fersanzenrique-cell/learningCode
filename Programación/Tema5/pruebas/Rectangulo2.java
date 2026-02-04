package Programación.Tema5.pruebas;

public class Rectangulo2 {
    private Punto p1, p2;
    private static int contador;

    Rectangulo2 (Punto p1, Punto p2) {
        this.p1 = new Punto(p1);
        this.p2 = new Punto(p2);
        contador++;
    }

    Rectangulo2 () {
        this.p1 = new Punto (0,0);
        this.p2 = new Punto (0,0);
        contador++;
    }

    Rectangulo2 (int x1,int y1,int x2, int y2) {
        this.p1 = new Punto(x1, y1); 
        this.p2 = new Punto(x2, y2);
        contador++;
    }

    Rectangulo2 (Rectangulo2 r) {
        this.p1 = new Punto(r.p1);
        this.p2 = new Punto(r.p2);
        contador++;
    }

    Punto getP1() {
        return new Punto(p1.getX(),p1.getY());
    }
    Punto getP2() {
        return new Punto(p2.getX(),p2.getY());
    }
    static int getContador() {
        return contador;
    }
    @Override
    public String toString() {
        return "[" + getP1().toString() +","+ getP2().toString() + "]";
    }
}
