class Empresa {
    private String nombre;
    private Empleado[] listaEmpleados;
    private Cliente[] listaClientes;
    Empresa (String nombre, Empleado[] listaEmpleados, Cliente[] listaClientes) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
        this.listaClientes = listaClientes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }
    public Cliente[] getListaClientes() {
        return listaClientes;
    }
}
