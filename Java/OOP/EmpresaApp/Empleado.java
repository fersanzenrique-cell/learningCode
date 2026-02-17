
package Java.OOP.EmpresaApp;
import java.util.ArrayList;

public class Empleado extends Persona {
    private double sueldoBruto;
    private char categoria;
    private ArrayList<Empleado> subordinados;

    public Empleado (String n, int e, double s) {
        super(n,e);
        this.sueldoBruto = s;
    }
    public Empleado (String n, int e, double s, char cat, ArrayList <Empleado> sub) {
        super(n,e);
        this.sueldoBruto = e;
        this.categoria = cat;
        this.subordinados = sub;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    
    
}
