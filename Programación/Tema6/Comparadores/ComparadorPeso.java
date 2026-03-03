package Programación.Tema6.Comparadores;

import java.util.Comparator;

public class ComparadorPeso implements Comparator<Persona> {
    @Override
    public int compare(Persona o1,Persona o2) {
        return Double.compare(o1.getPeso(), o2.getPeso());
    }
}
