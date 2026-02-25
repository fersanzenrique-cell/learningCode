package Programación.Tema7.Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Principal {
    public static ArrayList <AnimalTerrestre> animales = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        
        animales.add(new CaracolTurbo("mougs", LocalDate.now()));
        animales.add(new Saltamontes("mogus", LocalDate.now()));
        animales.add(new Serpiente("amogus", LocalDate.now()));

        Random rd = new Random();
        boolean superada;
        do {
            superada = false;
            int azar = rd.nextInt(0,3);
            animales.get(azar).correr();
            imprimir();
            scroll();
            for (AnimalTerrestre animal : animales) {
                if (animal.getDesplazamiento() >= 25) {
                    superada = true;
                    System.out.println("Ha ganado " + animal.getNombre());
                }
            }
        } while(!superada);
    }
    public static void imprimir() {
        for (AnimalTerrestre animal : animales) {
            System.out.println(animal.huella());
        }
    }
    public static void scroll() throws InterruptedException{
        for (int i = 0; i < 1; i++) {
            System.out.println();
        }
        Thread.sleep(1000);
    }
}
