package Programación.Tema5.Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Jose", 42, 2);
        p1.getYearsConsolidados();
        
        System.out.println(p1.obtenerSalarioBase());

        ProfesorEmerito p2 = new ProfesorEmerito("Marco", 57, 5, 20);

        System.out.println(p2.obtenerSalarioBase());
        System.out.println(p2.toString());

    }
}
