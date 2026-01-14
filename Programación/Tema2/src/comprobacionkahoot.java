public class comprobacionkahoot {
    public static void main(String[] args) {

        int val = 100;
        val /= 10 + 10; // val /= 20 -> val = 100 / 20 -> val = 5
        // /= abreviar variable
        System.out.println(val);

        int x = 10;
        System.out.println(x++*2); //hace el * primero
        int y = 10;
        System.out.println(++y*2); //hace el ++ primero

        int a = 10 % 3 % 2; // int a = ( 10 % 3 ) % 2;
        System.out.println(a); //1

        int x1 = 6;
        int y1 = 2;
        int x2 = x1>>y1;
        System.out.println(x2);

        int a1 = 10, b = 1, c = a1 + b;
        System.out.println("Total: " + a + b + c); //pregunta de examen
        System.out.println(a + b + c + " es el total");

    }
}
