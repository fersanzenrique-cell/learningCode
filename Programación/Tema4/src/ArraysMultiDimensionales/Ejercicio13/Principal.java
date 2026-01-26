package ArraysMultiDimensionales.Ejercicio13;

import java.util.Scanner;

public class Principal {

    static Scanner In = new Scanner(System.in);
    public static void main(String[] args) {

        int inNum;

        Matriz m = new Matriz(In.nextInt(), In.nextInt());

        do {
            inNum = In.nextInt();

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
