public class Main {
    public static void main(String[] args) {
        double a= 1305.435453654654645654;
        int b = (int)a;
        float c = (float)a;
        byte d = (byte)a;
        System.out.println("double " + a);
        System.out.println("int " + b);
        System.out.println("float " + c);
        System.out.println("byte " + d);
        char c1 = 'a';
        char c2 = '1';
        System.out.println(c1);
        System.out.println(c2);

        int aa = c1;
        int bb = c2;
        System.out.println(aa);
        System.out.println(bb);

        int numerob = 98;
        char letrab = (char)numerob;
        System.out.println("numero " + numerob);
        System.out.println("letrab " + letrab);

        char letra= (char)100;
        System.out.println(letra);

        char omg = '1';
        int omg2 = Integer.parseInt(String.valueOf(omg));
        System.out.println(omg2); /* comentario de varias
        lineas */

    }
}