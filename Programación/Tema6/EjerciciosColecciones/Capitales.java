package Programación.Tema6.EjerciciosColecciones;

import java.lang.foreign.ValueLayout;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Capitales {
    public static void main(String[] args) {
        Map<String,String> capitales = new HashMap<>();
        capitales.put("Irlanda", "Dublin");
        capitales.put("Francia", "Paris");
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");

        for (String capital : capitales.values()) {
            System.out.print(capital + " ");
        }
        System.out.println();
        for (String pais : capitales.keySet()) {
            System.out.print(pais + " ");
        }
        
        System.out.println("\n1");

        Set<String> capitalesSet = capitales.keySet();
        for (String valor : capitalesSet) {
            System.out.println(valor + " = > " + capitales.get(valor));
        }

        System.out.println("2");

        capitales.put("Italia","Roma");
        capitales.put("Portugal","Lisbon");

        capitales.forEach((k,v) -> System.out.println(k + " ==> " + v));
        System.out.println("3");

        capitales.remove("Portugal");

        capitales.forEach((k,v) -> System.out.println(k + " ==> " + v));
        System.out.println("4");


        capitales.clear();
        System.out.println("5");
        
        capitales.forEach((k,v) -> System.out.println(k + " ==> " + v));
        
    }
}
