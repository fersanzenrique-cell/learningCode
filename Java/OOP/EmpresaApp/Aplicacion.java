package Java.OOP.EmpresaApp;

import java.util.ArrayList;

public class Aplicacion {

    static private ArrayList<Empresa> empresas;

    public static ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public static ArrayList<Empleado> devolverEmpleados (Empresa e) {
        return e.getEmpleados();
    }

    public static Cliente devolverCliente(Empresa e, int t) {
        if (e == null || e.getClientes() == null) return null;

        for (Cliente cliente : e.getClientes()) {
            if (Integer.valueOf(cliente.getTelf()).equals(t)) {
                return cliente;
            }
        }
        return null;
    }

    private static double getMemoriaLibre() { return Runtime.getRuntime().freeMemory(); }
    private static double getMemoriaMaxima() { return Runtime.getRuntime().maxMemory(); }
    private static double getMemoriaTotal() { return Runtime.getRuntime().totalMemory(); }


    public static void main(String[] args) {

        // ===== CLIENTES =====
        Cliente c1 = new Cliente("Ana López");
        c1.setEdad(30);
        c1.setTelf(600111111);

        Cliente c2 = new Cliente("Carlos Pérez");
        c2.setEdad(45);
        c2.setTelf(600222222);

        Cliente c3 = new Cliente("Lucía Martín");
        c3.setEdad(27);
        c3.setTelf(600333333);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);


        // ===== EMPLEADOS =====
        Empleado jefe = new Empleado("María García", 50, 3500);
        jefe.setCategoria('A');

        Empleado emp1 = new Empleado("Pedro Sánchez", 35, 1800);
        emp1.setCategoria('B');

        Empleado emp2 = new Empleado("Laura Díaz", 29, 1700);
        emp2.setCategoria('B');

        // Subordinados del jefe
        ArrayList<Empleado> subs = new ArrayList<>();
        subs.add(emp1);
        subs.add(emp2);

        jefe.setSubordinados(subs); // necesitas el setter


        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(jefe);
        empleados.add(emp1);
        empleados.add(emp2);


        // ===== EMPRESA =====
        Empresa empresa = new Empresa(
                "Tech Solutions S.L.",
                empleados,
                clientes
        );

        System.out.println("\nClientes:");
        for (Cliente c : empresa.getClientes()) {
            System.out.println(c.getNombre() + " — Tel: " + c.getTelf());
        }

        System.out.println("\nEmpleados:");
        for (Empleado e : empresa.getEmpleados()) {
            System.out.println(e.getNombre() + " — Sueldo: " + e.getSueldoBruto());
        }

        // Buscar cliente por teléfono usando tu método
        Cliente buscado = devolverCliente(empresa, 600222222);

        System.out.println("\nBúsqueda por teléfono:");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getNombre());
        } else {
            System.out.println("Cliente no encontrado");
        }
        
        System.out.printf(
            "\n Memoria máxima: " + String.format("%.3f",getMemoriaMaxima() / 1000000) + " MB" +
            "\n Memoria libre: " + String.format("%.3f",getMemoriaLibre() / 1000000) + " MB" +
            "\n Memoria total: " + String.format("%.3f",getMemoriaTotal() / 1000000) + " MB" +
            "\n Memoria usada: " + String.format("%.3f",(getMemoriaTotal() - getMemoriaLibre()) / 1000000) + " MB"
        );
        

        System.out.println();

    }
    

}
