public class Main {
    public static void main(String[] args) {
        enum meses {
            Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto,Septiembre,Octubre,Noviembre,Diciembre
        }
        meses m = meses.Marzo;
        //float numeromes = Float.valueOf(meses.Marzo);
        System.out.println("El mes seleccionado es: " + m + ".");
        //System.out.println("El mes es el numero: " + numeromes + ".");
    }
}