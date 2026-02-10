package ArraysMultiDimensionales.Ejercicio13;

import java.util.Scanner;

import ArraysMultiDimensionales.Arrays2D;

public class Principal {

    static Scanner In = new Scanner(System.in);
    
    static Matriz mat = new Matriz(In.nextInt(), In.nextInt());
    public static void main(String[] args) {
        System.out.println(
            "¡Has creado una matriz de " + mat.getM() + " columnas y " + mat.getN() + " filas!" 
        );
        mat.inicializarMatriz();
        
        menu();
    }

    

    static void menu() {

        int inNum;

        do {

            System.out.println(
                "1.- Visualizar tabla \n" +
                "2.- Sumar los valores de una fila \n" +
                "3.- Sumar los valores de una columna \n" +
                "4.- Sumar los valores de la diagonal \n" +
                "5.- Máximo \n" +
                "0.- Salir \n"
            );

            inNum = In.nextInt();
            
            switch (inNum) {
                case 1:
                    mat.visualizar();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Introduce nº de fila a sumar. \n");
                    mat.sumaFilaPrimitivo(In.nextInt());
                    break;
                case 3:
                    System.out.println("Introduce nº de columna a sumar. \n");
                    mat.sumaColumnaPrimitiva(In.nextInt());
                    break;
                case 4:
                    System.out.println("La suma del diagonal es:");
                    mat.sumaDiagonal();
                    break;
                case 5:
                    
                    System.out.println(mat.maximo());
                default:
                    break;
            }
        } while (inNum != 0);
    }
}
