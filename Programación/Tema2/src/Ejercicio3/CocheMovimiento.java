package Ejercicio3;

import java.util.Scanner;

public class CocheMovimiento {
    String marca;
    int cilindrada;
    boolean arrancar;
    CocheMovimiento(String marca, int cilindrada){
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    void quererarrancar(){
        if (arrancar){
            System.out.println("El coche ya está arrancado.");
        } else {
            System.out.println("El coche arrancará ahora mismo.");
        }
    }
    void quererapagar() {
        if (arrancar){
            System.out.println("El motor está apagado.");
        } else {
            System.out.println("El motor ya estaba apagado.");
        }
    }
    void acelerar() throws InterruptedException {
        if (arrancar){
            Scanner sc = new Scanner(System.in);

            System.out.println("¿Por cuantos segundos quiere acelerar?");
            int segundos = sc.nextInt();
            sc.nextLine();

            System.out.println("¿Cuánto pesa su coche? (en kg)");
            int peso = sc.nextInt();
            sc.nextLine();

            while (segundos <= 1||peso <= 500) {
                System.out.println("¿Usted ve razonable acelerar por " + segundos +
                        "conduciendo un coche que pesa " + peso + " kilogramos?");
                System.out.println("Piense otra vez en lo que quiere hacer");
                for (int i = 0; i < 5; i++) {
                    System.out.print(".");
                    Thread.sleep(1000);//Hacer que añada puntos lentamente
                }
                System.out.println("Vuelva a poner los segundos que quiere acelerar y el peso del vehículo.");
                segundos = sc.nextInt();
                sc.nextLine();
                peso = sc.nextInt();
                sc.nextLine();
            }




        } else {
            System.out.println("Usted tiene que arrrancar el coche primero.");
        }
    }
}
