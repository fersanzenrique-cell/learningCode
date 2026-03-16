package Java.ProyectoRedes;

public class puebas {
    public static void main(String[] args) {
        String mascara = "";
        for (int i = 0; i < 0+1;i++) {
            mascara += "255.";
        }
        String binarioHost = "";
        int numBits = 5;
        for (int i = 0; i < numBits; i++) {
            binarioHost += "1";
            if (i == numBits-1) {
                for (int j = 0; j < 8-numBits; j++) {
                    binarioHost += "0";
                }
            }
        }

        int resultadoHost = Integer.parseInt(binarioHost,2); 

        System.out.println(mascara + resultadoHost);
        
    }
}
