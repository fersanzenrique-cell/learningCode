public class Main {
    public static void main(String[] args) {
        short x = 7;
        int y = 5;
        float f1 = 13.5f,f2 = 8f;

        System.out.println("El valor x es " + x + " y el valor de y" + y);
        System.out.println("El resultado de x+y es " + (x+y)); // hace la operacion de forma correcta
        System.out.println("El resultado de x+y es " + x+y); //pega lo valores literalmente (pegamento)
        System.out.println("El resultado de x-y es " + (x-y));
        System.out.println("El resultado de x/y es " + (x/y));


        System.out.printf("%s %d\n","El resultado de x/y es ",(x/y)); //el primer concepto es el formato, especificaciones (en printf)
        System.out.println("El resto de la división de x%y es " + (x%y));

        System.out.println("El resultado de f1/f2 es: " + (f1/f2));
        System.out.printf("%s %.2f\n","El resultado de f1/f2 es:",f1/f2); // %s = String
        System.out.printf("El resultado de %s/%s es %.2f\n",f1,f2,f1/f2); //.2f = float \n = salto de línea

        System.out.println("El resto de f1%f2 es "+ (f1%f2));
        System.out.printf("%s %.0f\n","El resultado de f1%f2",f1%f2);
    }
}