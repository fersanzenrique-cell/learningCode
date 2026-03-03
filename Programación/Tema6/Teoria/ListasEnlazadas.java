package Programación.Tema6.Teoria;

import java.util.LinkedList;

public class ListasEnlazadas {
    public static void main(String[] args) {
        LinkedList<String> listado1 = new LinkedList <>(); // tipo String
        LinkedList listado2 = new LinkedList(); // tipo Object

        listado2.add(10);
        listado2.add(20);
        listado2.addFirst(5);
        listado2.addLast(25);
        listado2.offer(2); // al final
        listado2.offerFirst(1);
        listado2.offerLast(10);
        listado2.push(40);

        listado1.addAll(listado2);

        System.out.println("Listado 1: " + listado1);

        System.out.println("Listado 2: " + listado2);
    }
}
