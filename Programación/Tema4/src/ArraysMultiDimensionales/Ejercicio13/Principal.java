package ArraysMultiDimensionales.Ejercicio13;

import java.util.Scanner;

public class Principal {

    static Scanner In = new Scanner(System.in);
    static Matriz m = new Matriz(In.nextInt(), In.nextInt());

    public static void main(String[] args) {
        menu();
    }

    static void menu() {

        int inNum;

        do {
            inNum = In.nextInt();
            System.out.println(
                "1.- Visualizar tabla \n" +
                "2.- Sumar los valores de una fila \n" +
                "3.- Sumar los valores de una columna \n" +
                "4.- Sumar los valores de la diagonal \n" +
                "5.- Máximo \n" +
                "0.- Salir \n"
            
            );
            switch (inNum) {
                case 1:
                    m.visualizar();
                    break;
                case 2:
                    m.sumaFilaPrimitivo(inNum);
                    break;
                case 3:
                    m.sumaColumnaPrimitiva(inNum);
                    break;
                case 4:
                    m.sumaDiagonal();
                    break;
                case 5:
                    m.maximo(); 
                default:
                    break;
            }

        } while (inNum != 0);
    }
}
