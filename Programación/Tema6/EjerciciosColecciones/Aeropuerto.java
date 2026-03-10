package Programación.Tema6.EjerciciosColecciones;

import java.time.LocalDate;
import java.util.TreeSet;

public class Aeropuerto {
    private String nombre;
    private TreeSet<Vuelo> vuelos; /* El treeset puede prescindir del equals y del hashcode tiene un contain y un remove*/
    public Aeropuerto(String n){
        this.nombre = n;
        this.vuelos = new TreeSet<>();
    }
    public void addVuelo(Vuelo v) {
        vuelos.add(v);
    }
    public void deleteVuelo(Vuelo v) {
        vuelos.remove(v);
    }

    public int vuelosEnFecha(LocalDate fecha) {
        int contador = 0;
        for (Vuelo vuelo : this.vuelos) {
            if (fecha.equals(vuelo.getFecha().toLocalDate())) contador++;
        }
        return contador;
    }
    public int vuelosCompletos() {
        int contador = 0;
        for (Vuelo vuelo : this.vuelos) {
            if (vuelo.getNumPasajeros().equals(vuelo.getNumPlazas())) contador++;
        }
        return contador;
    }
    public double recuadaDestino(String destino) {
        double suma = 0;
        for (Vuelo vuelo : this.vuelos) {
            if (destino.equals(vuelo.getDestino())) suma += vuelo.getPrecio();
        }
        return suma;
    }
    public Vuelo vueloBaratoDestino() {
        
    }
    public Vuelo primerVueloPlazasLibres(LocalDate fecha) {

    }
    public Vuelo vueloMasOcupado(LocalDate fecha) {

    }
    public void subirPrecio(int porcentaje, LocalDate fecha) {

    }
    @Override
    public String toString() {
       return this.nombre + "\n" + this.vuelos;
    }
}
