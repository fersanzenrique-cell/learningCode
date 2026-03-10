package Programación.Tema6.EjerciciosColecciones;

import java.util.HashMap;
import java.util.Map;

public class CochePrincipal {
    public static void imprimirSet (Map e) {
        e.forEach((k,v) -> System.out.println(k + " => " + v));
    }
    public static void main(String[] args) {
        Map<String,Coche> libres = new HashMap<>();
        Map<String,Coche> alquilados = new HashMap<>();


        libres.put("1",new Coche("1230 DLT","Skoda","Alamar"));
        
    }
}
