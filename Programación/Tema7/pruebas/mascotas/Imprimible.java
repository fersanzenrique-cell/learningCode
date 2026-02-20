package Programación.Tema7.pruebas.mascotas;

import java.util.ArrayList;
import java.util.HashMap;

public interface Imprimible {
    public abstract String devolverContenidoString();
    public abstract ArrayList<String> devolverContenidoArrayList();
    public abstract HashMap<String,String> devolverContenidoHashMap();
}
