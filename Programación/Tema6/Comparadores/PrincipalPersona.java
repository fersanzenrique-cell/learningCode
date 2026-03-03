package Programación.Tema6.Comparadores;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Rosa
 */
public class PrincipalPersona {

    public static void main(String[] args) {
        LinkedList<Persona> lista = new LinkedList<>();
        //String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNac, double peso, int altura
        lista.add(new Persona("1234","Zaca","Martos","Jimenez",LocalDate.of(2000,5,11),68.5,170));
        lista.add(new Persona("2234","Pepe","Martin","Arias",LocalDate.of(2002,7,22),68.5,172));
        lista.add(new Persona("5534","Pepa","Martin","Arias",LocalDate.of(2002,7,22),68.8,168));
        lista.add(new Persona("5234","Ana","Martin","Losada",LocalDate.of(2001,2,10),70,180));
        lista.add(new Persona("2235","Carmen","Morato","Lopez",LocalDate.of(1999,6,19),62,165));
        
        System.out.println("Lista original:");
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por apellido1):");
        // comparador implementado en la clase Persona, orden natural
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por dni):");
        // comparador implementado en una clase externa
        Collections.sort(lista, new ComparadorDni());
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por dni) con expresión lambda:");
        // comparador autocontenido expresado como una lambda, incluso menos verbose
        Comparator<Persona> comparadorDni = (o1,o2) -> o1.getDni().compareToIgnoreCase(o2.getDni());

        Collections.sort(lista, comparadorDni);
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por fecha de nacimiento):");
        // comparador implementado en una clase externa
        Collections.sort(lista, new ComparadorFechaNac());
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por peso):");
        // comparador autocontenido expresado como una lambda
        Comparator<Persona> comparadorPeso = (Persona o1, Persona o2) -> Double.compare(o1.getPeso(), o2.getPeso());
        Collections.sort(lista,comparadorPeso);
        System.out.println(lista);
                
        
        System.out.println("Lista ordenada (por altura):");
        // comparador autocontenido expresado como una lambda menos verbose
        Comparator<Persona> comparadorAltura = (o1,o2) -> Integer.compare(o1.getAltura(), o2.getAltura());
        Collections.sort(lista,comparadorAltura);
        System.out.println(lista);
        
        System.out.println("Lista ordenada (por altura la revés):");
        
        Collections.sort(lista,comparadorAltura.reversed());
        System.out.println(lista);
    }

}
