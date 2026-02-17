package Java.OOP.EmpresaApp;
import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa(String n, ArrayList<Empleado> e, ArrayList<Cliente> c) {
        this.nombre = n;
        this.empleados = e;
        this.clientes = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    

}
