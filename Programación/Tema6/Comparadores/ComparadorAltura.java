package Programación.Tema6.Comparadores;

import java.util.Comparator;

public class ComparadorAltura implements Comparator<Persona>{
    public int compare(Persona o1,Persona o2) {
        return Integer.compare(o1.getAltura(), o2.getAltura());
    }
}
