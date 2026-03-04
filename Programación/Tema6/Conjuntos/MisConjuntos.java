package Programación.Tema6.Conjuntos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class MisConjuntos {
    public static void main(String[] args) {
        HashSet<String> conjuntoHash = new HashSet<>();
        System.out.println(conjuntoHash.size());
        conjuntoHash.add("amogus") ;
        conjuntoHash.add("skibidi");

        for (String string : conjuntoHash) {
            System.out.println(string);
        }
        LinkedHashSet<String> conjuntoLinked = new LinkedHashSet<>();
        conjuntoLinked.add("conjunto");
        conjuntoLinked.add("Linked");
        conjuntoLinked.add(".add");
        conjuntoLinked.add("();");
        
        for (String string : conjuntoLinked) {
            System.out.print(string);
        }
        System.out.println();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("tree");
        treeSet.add("Set");
        treeSet.add(".add");
        treeSet.add("()");
        //treeSet.add("tree");

        for (String a : treeSet) {
            System.out.print(a);
        }
        // recorrido por con interadores
        System.out.println();
        Iterator<String> iterador = treeSet.iterator();

        while (iterador.hasNext()) {
            String s = iterador.next();
            System.out.print(s);
        }
        System.out.println();
        Map<String,String> mapa = new HashMap<>();
    }
}
