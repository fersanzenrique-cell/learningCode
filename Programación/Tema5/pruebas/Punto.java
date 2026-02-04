package Programación.Tema5.pruebas;
// Clase POJO, plain old Java object
public class Punto {
    private int x,y;

    Punto (int x , int y){
        this.x = x;
        this.y = y;
    }

    Punto () {
        this(0, 0);
    }

    Punto (Punto p) {
        this.x = p.x;
        this.y = p.y;
    }

    int getX() {
        return x;
    }
    void setX(int x) {
        this.x = x;
    }
    int getY() {
        return y;
    }
    void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + " , " + y + ")";
    }
}
