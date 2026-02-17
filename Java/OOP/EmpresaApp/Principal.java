package Java.OOP.EmpresaApp;

import java.util.ArrayList;

public class Principal {

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


        // ===== APLICACION =====
        Aplicacion app = new Aplicacion();

        // Inicializar lista de empresas (si no lo hiciste en constructor)
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        listaEmpresas.add(empresa);


        // ===== PRUEBAS =====

        System.out.println("Empresa: " + empresa.getNombre());

        System.out.println("\nClientes:");
        for (Cliente c : empresa.getClientes()) {
            System.out.println(c.getNombre() + " — Tel: " + c.getTelf());
        }

        System.out.println("\nEmpleados:");
        for (Empleado e : empresa.getEmpleados()) {
            System.out.println(e.getNombre() + " — Sueldo: " + e.getSueldoBruto());
        }

        // Buscar cliente por teléfono usando tu método
        Cliente buscado = app.devolverCliente(empresa, 600222222);

        System.out.println("\nBúsqueda por teléfono:");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.getNombre());
        } else {
            System.out.println("Cliente no encontrado");
        }
    }
}

