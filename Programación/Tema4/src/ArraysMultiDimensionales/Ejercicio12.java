package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        String[] fila1 = {"?","Irene","Nayara","Jesús","Alejandro","Jaime","Aitor","Adrian"};
        String[] fila2 = {"Dario","Ivan","Raul","Carlos","Samuel","Zakaria", "?","Marta"};
        String[] fila3 = {"Victor","Alvaro","Alonso","Robert","David","Nieves"};
        String[] fila4 = {"Izan","Adrian","Carlos","Lucia","Rodrigo"};

        String[][] clase = {fila1, fila2, fila3, fila4};

        System.out.println(Arrays.deepToString(clase));

    }

}
