package Programación.Tema6.EjerciciosColecciones;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    public Coche(String matri, String marca, String modelo) {
        this.matricula = matri;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Coche(Coche c) {
        this(c.getMatricula(), c.getMarca(), c.getModelo());
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return getMatricula() + " " + getMarca() + " " + getModelo();
    }
}
