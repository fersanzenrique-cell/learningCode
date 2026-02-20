package Programación.Tema7.pruebas.mascotas;

public class Gato extends Mascota{
    public Gato(String nombre){
        super(nombre);
    }
    @Override
    public String emitirSonido(){
        return this.getNombre().substring(0, 3) + " miau";
    }
}
