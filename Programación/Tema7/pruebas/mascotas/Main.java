package Programación.Tema7.pruebas.mascotas;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Scooby Doo");

        System.out.println(perro1.emitirSonido());
        ArrayList <Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Garfield"));
        gatos.add(new Gato("Doja"));
        
        for (Gato gato : gatos) {
           System.out.println(gato.emitirSonido()); 
        }
        
    }
    
}
