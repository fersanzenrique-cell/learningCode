package Ejercicio6a;

import java.util.Scanner;

public class Banco {
    //variable global
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1, 100);
        Cuenta c2 = new Cuenta(1, 500);

        int cuentaOrigen = elegirCuenta();
        int opcion;

        do {

            mostrarMenu();
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                {
                    System.out.println("Cuanto quiere sacar? > ");
                    double dinero = teclado.nextDouble();
                    if(cuentaOrigen==1) {
                        c1.retirar(dinero);
                    } else if (cuentaOrigen==2) {
                        c2.retirar(dinero);
                    }
                } break;
                case 2:
                {
                    System.out.println("Cuanto quiere depositar? > ");
                    double dinero = teclado.nextDouble();
                    if(cuentaOrigen==1) {
                        c1.depositar(dinero);
                    } else if (cuentaOrigen==2) {
                        c2.depositar(dinero);
                    }
                } break;
                case 3:
                {
                    System.out.println("Cuanto quiere tranferir? > ");
                    double dinero = teclado.nextDouble();
                    if(cuentaOrigen==1) {
                        c1.transferencia(c2,dinero);
                    } else if (cuentaOrigen==2) {
                        c2.transferencia(c1,dinero);
                    }
                } break;
                case 4:
                {
                    if(cuentaOrigen==1) {
                        System.out.println(c1.toString());
                    } else if (cuentaOrigen==2) {
                        System.out.println(c2.toString());
                    }
                } break;
                case 5:
                    cuentaOrigen=elegirCuenta();
                    break;
                case 0:
                    System.out.println("Adíos");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while(opcion != 0);
        teclado.close();
    }

    public static void mostrarMenu() {
        //presentar menu
        System.out.println("1.- Sacar dinero de la cuenta");
        System.out.println("2.- Ingresar dinero en la cuenta");
        System.out.println("3.- Hacer una transferencia entre cuentas");
        System.out.println("4.- Consultar saldo");
        System.out.println("5.- Cambiar cuenta");
        System.out.println("0.- Salir");
        System.out.print("Opción > ");
    }
    public static int elegirCuenta(){
        System.out.println("Elija una cuenta 1 o 2 > ");
        return teclado.nextInt();
    }
}

