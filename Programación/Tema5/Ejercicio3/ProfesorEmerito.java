package Programación.Tema5.Ejercicio3;

public class ProfesorEmerito extends Profesor {
    private int yearsEmerito;

    public ProfesorEmerito (String nombre ,int edad, int yearsConsolidados, int yearsEmerito) {
        super(nombre, edad, yearsConsolidados);
        this.yearsEmerito = yearsEmerito;
    }
    
    public int getYearsEmerito() {
        return yearsEmerito;
    }
    public void setYearsEmerito(int yearsEmerito) {
        this.yearsEmerito = yearsEmerito;
    }

    @Override
    public double obtenerSalarioBase() {
        return super.obtenerSalarioBase() + (67.80 * getYearsEmerito());
    }
}
