package diagramaflujo;

public class Sumarpares {
    private int num;

    Sumarpares(int num) {
        this.num = num;
    }

    public int operacion() {
        int suma = 0;
            for (int i = 0; i <= this.num; i++) {
                if (i % 2 == 0 && i > 0) { // si es par
                    suma += i;
                    System.out.print(" + " + i );
                }
            }
        System.out.println("\nLa suma de los pares hasta " + this.num + " es " + suma);
        return suma;
    }
}
