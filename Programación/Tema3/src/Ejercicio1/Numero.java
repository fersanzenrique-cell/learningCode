package Ejercicio1;

public class Numero {
    //atributo
    private int num;
    //constructor
    public Numero(int num){
        this.num=num;
    }
    //get y set
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
       this.num = num;
    }
    public void paridad() {
        if (this.num % 2 == 0 && this.num != 0) {
            System.out.println("El número es par");
        }
        if (this.num % 2 != 0) {
            System.out.println("Número es impar");
        }
    }
    //otras funciones
    public void signo() {
        if (this.num > 0) {
            System.out.println("El numero es positivo");
        }
        if (this.num < 0) {
            System.out.println("El numero es negativo");
        }
    }
    public void cero() {
        if (this.num == 0) {
            System.out.println("El numero es 0, o neutro");
        }
    }
}
