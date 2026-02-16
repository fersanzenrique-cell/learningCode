package Programación.Tema5.Pokemons;

import java.util.ArrayList;
import java.util.Random;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Pokemon> lista = new ArrayList<>();

        Agua vaporeon = new Agua("vaporeon",120,80);
        Fuego charizard = new Fuego("charizard",250,84);
        Planta metapod = new Planta("metapod",300,20);
        Pokemon evee = new Pokemon("evee",100,30);

        System.out.println("Clase a la que pertenece vaporeon= " + vaporeon.getClass().getSimpleName());
        System.out.println("Clase de la que hereda vaporeon= " + vaporeon.getClass().getSuperclass().getSimpleName());
        System.out.println(vaporeon instanceof Pokemon); // es true
        System.out.println(vaporeon instanceof Agua);    // es true

        lista.add(vaporeon);
        lista.add(charizard);
        lista.add(metapod);
        lista.add(evee);

        // van a luchar al azar 2 pokemons de la lista
        Random rd = new Random();
        int p1 = rd.nextInt(0,lista.size());
        System.out.println(lista.get(p1).getClass().getSimpleName());
        int p2 = rd.nextInt(0,lista.size());
        // para evitar que tenga dos veces el mismo pokemon
        while(p1 == p2){
            p2 = rd.nextInt(0,lista.size());;
        }
        int contador = 0;
        while (!lista.get(p2).isDead()) {

            System.out.println("ANTES DE ATACAR");
            System.out.println("Atacante: " + lista.get(p1).getNombre());
            System.out.println(lista.get(p1).toString());
            System.out.println("Atacado: " + lista.get(p2).getNombre());
            System.out.println(lista.get(p2).toString());

            lista.get(p1).attack(lista.get(p2)); // utiliza el attack que toque dinámicamente

            System.out.println("DESPUÉS DE ATACAR");
            System.out.println(lista.get(p1).toString());
            System.out.println(lista.get(p2).toString());
            contador++;
            System.out.println("Lucha nº: "+ contador);

        }
    }
}
