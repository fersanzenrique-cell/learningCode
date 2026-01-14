package Ejercicio3;

public class HistoriaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Azul","Hyundai");
        coche1.modelo = "Tucson";
        coche1.cilindrada = 4;
        coche1.imprimirmodeloymarca();

        Coche coche2 = new Coche("Rojo","Seat");
        coche2.modelo = "León";
        coche2.cilindrada = 4;
        coche2.imprimirmodeloymarca();
        coche2.estadocoche = true;
        coche2.estadocoche();

        CocheMovimiento coche3 = new CocheMovimiento("Rojo",8);
        coche3.quererapagar();
    }
}
