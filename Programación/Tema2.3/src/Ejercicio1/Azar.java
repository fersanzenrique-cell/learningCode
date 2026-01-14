package Ejercicio1;

import java.util.Random;

public class Azar {
    private int aleatorio;

    public Azar() {
        Random random = new Random();
        this.aleatorio = random.nextInt(1,101);
    }

    public boolean mayor (int num) {
        return this.aleatorio > num;
    }
    public boolean menor (int num) {
        return this.aleatorio < num;
    }
    public boolean igual (int num) {
        return this.aleatorio == num;
    }
}
