package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {

        String[] fila1 = {"Irene","Nayara","Jesús","Alejandro","Jaime","Aitor","Adrian"};
        String[] fila2 = {"Dario","Ivan","Raul","Carlos","Samuel","Zakaria","Lucia"};

        /* Segunda manera */

        String[] fila3,fila4;

        fila3 = new String[]{"Victor","Alvaro","Alonso","Enrique","Robert","David","Nieves"};
        fila4 = new String[]{"Izan","Alex","Carlos","Marta","Rodrigo","Lucia"};

        String[][] clase = {fila1, fila2, fila3, fila4};

        /* Tercera */

        clase[4] = new String[] {"pepito","agustin"};

        System.out.println(Arrays.deepToString(clase));

    }

}
