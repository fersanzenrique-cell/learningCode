package Java.ProyectoRedes;

public abstract class Dispositivo {
    private String nombre;
    private String codigo;
    private String direccionIp;
    private String barra;
    public Dispositivo(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDireccionIp() {
        return direccionIp;
    }
    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }
    public String getBarra() {
        return barra;
    }
    public void setBarra(String barra) {
        this.barra = barra;
    }
    
}
