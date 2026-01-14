package Ejercicio2;

public class RelojHistoria {
    public static void main (String[] args) throws InterruptedException {
        Reloj reloj1 = new Reloj(5324);
        System.out.println(
                reloj1.getHoras() + " " +
                reloj1.getMinutos() + " " +
                reloj1.getSegundos()
        );
        System.out.println(reloj1.toString());
        Reloj reloj2 = new Reloj();
        int contador = 70;
        for (int i=0;i<contador;i++){
            reloj2.tick();
            System.out.println(reloj2.toString());
            Thread.sleep(1000);
        }
    }
}
