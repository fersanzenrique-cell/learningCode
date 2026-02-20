package Programación.Tema7.pruebas.mascotas;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Mascota implements Imprimible {
   private String nombre;
   public Mascota(String nombre) {
      this.nombre = nombre;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public abstract String emitirSonido(); 
   @Override
   public String devolverContenidoString(){
     return "";
   }
   @Override
   public ArrayList<String> devolverContenidoArrayList() {
     return null;
   }
   @Override
   public HashMap<String,String> devolverContenidoHashMap(){
     HashMap<String,String> mapa = new HashMap<>();
     mapa.put("nombre", nombre);
     return mapa;
   }
}
