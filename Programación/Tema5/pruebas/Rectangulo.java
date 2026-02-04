package Programación.Tema5.pruebas;

public class Rectangulo {
    private int x1,y1,x2,y2;
    private String nombre;
    private static int contador;
    

    Rectangulo(int x1, int y1 , int x2 , int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        contador++;
        this.nombre = "coordenadas," + contador;
    }

    Rectangulo() {
        this(0, 0, 0, 0);
        contador++;
        this.nombre = "0," + contador;
    }

    Rectangulo(int base, int altura) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = base;
        this.y2 = altura;
        //this(0,0,base,altura);
        contador++;
        this.nombre = "sincoordenadas," + contador;
    }

    Rectangulo (Rectangulo r) {
        this.x1 = r.x1;
        this.y1 = r.y1;
        this.x2 = r.x2;
        this.y2 = r.y2;
        // this(r.x1, r.y1, r.x2, r.y2);
        contador++;
        this.nombre = "objeto," + contador;
    }

    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    public String getNombre() {
        return nombre;
    }
    public static int getContador() {
        return contador;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return x1 +","+ y1 +" "+ x2 + ","+ y2;
    }

}
