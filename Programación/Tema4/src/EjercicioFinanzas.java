public class EjercicioFinanzas {
    public static void main(String[] args) {
        
        double interes = 0.1;

        double [][] arrayIntereses = new double[6][5];

        for (int i = 0; i < arrayIntereses.length; i++) {

            double acumulado = 10000;
            arrayIntereses[i][0] = acumulado;
            

            for (int j = 1; j < arrayIntereses[i].length; j++) {
                acumulado = acumulado + (acumulado * interes);
                arrayIntereses [i][j] = acumulado;
            }

            interes += 0.01;

        }

        System.out.println();
        for (double[] fila : arrayIntereses) {
            for (double num : fila) {
                System.out.printf("%1.2f ", num);
            }
            System.out.println();
        }
        System.out.println();
        // Hacer clase que haga print de array de dos o mas dimensiones

        
        
    }
}
