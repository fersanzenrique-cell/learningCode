public class Directivo {
    private String nombre;
    private int edad;
    private float sueldo;
    private char categoria;
    private Empleado[] listaSubordinados;

    Directivo(String nombre, int edad, float sueldo, char categoria, Empleado[] listaSubordinados) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.listaSubordinados = listaSubordinados;
    }
    //seters y getters de los otros

    public char getCategoria() {
        return categoria;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public Empleado[] getListaSubordinados() {
        return listaSubordinados;
    }
}
