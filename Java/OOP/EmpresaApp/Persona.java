package Java.OOP.EmpresaApp;

class Persona {
    private String nombre;
    private int edad;
    Persona (String n, int e) {
        this.nombre = n;
        this.edad = e;
    }
    Persona (String n) {
        this.nombre = n;
    }
    String getNombre() {
        return nombre;
    }
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    int getEdad() {
        return edad;
    }
    void setEdad(int edad) {
        this.edad = edad;
    }
}
