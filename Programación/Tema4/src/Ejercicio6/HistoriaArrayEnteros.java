package Ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

class HistoriaArrayEnteros {
    static Scanner sc = new Scanner(System.in);

    static void rellenar(ArrayEnteros obj) {
        for (int i = 0; i < obj.getArrayEnteros().length; i++) {
            obj.getArrayEnteros()[i] = sc.nextInt();
        }
    }

    static void menu(ArrayEnteros obj) {
        int intIn = sc.nextInt();
        do { 
            System.out.println("   1. Intercambiar dos posiciones\n" + //
                                "   2. Hallar el máximo\n" + //
                                "   3. Hallar el mínimo\n" + //
                                "   4. Hallar la media\n" + //
                                "   5. Buscar un número\n" + //
                                "   6. Visualizar el array\n" + //
                                "   0. Salir\n" + //
            "");
            if (intIn != 0) {

                switch (intIn) {

                    case 1 -> {
                        System.out.println(
                                "Ingresa los dos números que quieras intercambiar(Separados por enter)."
                        );
                        
                        obj.intercambiar(sc.nextInt(),sc.nextInt());
                    }
                    case 2 -> obj.maximo();
                    case 3 -> obj.minimo();
                    case 4 -> obj.media();
                    case 5 -> {
                        System.out.println("Inserte el numero a encontrar.");
                        int numEncontrar = sc.nextInt();
                        int[] arrayTemp = obj.encontrar2(numEncontrar);
                        System.out.println(Arrays.toString(arrayTemp));
                        System.out.println("El numero se repite unas " + obj.cuentaVeces(numEncontrar) + " veces.");
                    }
                    case 6 -> obj.toString();
                    default -> System.out.println("Entrada no válida.");

                }
            }
                    
            
        } while (intIn != 0);
    }

    public static void main(String[] args) {
        System.out.println("Escriba el tamaño del array:");
        int tam = sc.nextInt(); // el Scanner es estático y disponible para todos los métodos
        if (tam > 0){
           ArrayEnteros nums = new ArrayEnteros(tam);
           rellenar(nums);
           menu(nums);
        }
        else {
           System.out.println("No se puede trabajar con un array del tamaño especificado");
        }
        sc.close();
    }

}