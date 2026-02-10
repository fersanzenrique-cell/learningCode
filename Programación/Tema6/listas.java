package Programación.Tema6;

import java.util.ArrayList;

public class listas {
    public static ArrayList <String> amoguses = new ArrayList<String>();
    public static void main(String[] args) {
        
        amoguses.add("el amogus rojo");
        amoguses.add("el amogus negro");
        amoguses.remove(0);
        amoguses.add(4,"el amogus sus");
    }
    public ArrayList getAmogus() {
        ArrayList <String> lista = amoguses;
        return lista;
        // ocultacion?
    }
}
