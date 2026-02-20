package Programación.Tema7.pruebas.mascotas;

public class Perro extends Mascota{
    public Perro(String nombre){
        super(nombre);
    }
    @Override
    public String emitirSonido(){
        return "goof";
    }
}
