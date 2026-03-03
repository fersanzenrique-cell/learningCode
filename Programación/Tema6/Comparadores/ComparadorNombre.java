package Programación.Tema6.Comparadores;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2){
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}
