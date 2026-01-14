
public class uhh {
    public static int sumaArray (int[] arrayNum) {
        int suma = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            suma = suma + arrayNum[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        boolean[] listaBoolean = new boolean[10];
        for (int i = 0; i < listaBoolean.length; i++) {
            if ((i * (4+i) % 10 == 0 )) {
                listaBoolean[i] = true;
            }
            System.out.print(listaBoolean[i]? "1" : "0");
        }

        int[] s = {0,1,4};
        s[1] = 2;
        System.out.println("\n" + s.length);


        System.out.println(sumaArray(s));
    }
}
