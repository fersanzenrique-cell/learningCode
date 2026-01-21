class Matrices2D {
    public void DisplayMatriz (int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.println("/");
                }
                System.out.println(" " + matriz [i][j] + " ");

            }
        }


    }
}
