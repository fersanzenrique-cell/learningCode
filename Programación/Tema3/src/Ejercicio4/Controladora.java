package Ejercicio4;

public class Controladora {
    public static void main(String[] args) {
        Socio s = new Socio("epifanio",18,true);
        Socio s2 = new Socio("epifania",21,true);
        System.out.println(s.cuota());
        System.out.println(s2.cuota());

    }

}
