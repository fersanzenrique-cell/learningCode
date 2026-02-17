package Java.OOP.EmpresaApp;

import java.util.ArrayList;

public class Aplicacion {

    private ArrayList<Empresa> empresas;

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    ArrayList<Empleado> devolverEmpleados (Empresa e) {
        return e.getEmpleados();
    }

    Cliente devolverCliente(Empresa e, int t) {
        if (e == null || e.getClientes() == null) return null;

        for (Cliente cliente : e.getClientes()) {
            // Tambien puedes usar  if (Integer.valueOf(cliente.getTelf()).equals(t))
            if (cliente.getTelf() == t) {
                return cliente;
            }
        }
        return null;
    }
    

}
