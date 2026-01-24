
/** 
*
* @Author enrique meñique
* @version 1.0
*/

/*
Libreria type of shi, así puedo visualizar mejor los arrays y matrices, debuggin y esas cosas.
*/
package ArraysMultiDimensionales;

public class Arrays2D {

    public static void DisplayMatriz (int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 && j == 0) {
                    System.out.print("/");
                } else if (j == matriz[i].length && i==0) {
                    System.out.print("\\");
                } else if (i > 0 && (j == 0 || j == matriz[i].length)) {
                    System.out.print("|");
                } else if (i == matriz.length && j == 0) {
                    System.out.print("\\");
                } else if (i == matriz.length && j == matriz[i].length) {
                    System.out.print("/");
                }
                // Espantoso, fijo que hay otra manera.
                System.out.print(" " + matriz [i][j] + " ");
                System.out.println();
            }
        }
    }

    /* ideas:  */
}
