package Programación.Tema6.EjerciciosColecciones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo>{
    private String codigo;
    private String destino;
    private Double precio;
    private Integer numPlazas;
    private Integer numPasajeros;
    private LocalDateTime fecha;

    public Vuelo(String c, String d, Double p, Integer nPlaz, Integer nPasa, LocalDateTime f) {
        this.codigo = c;
        this.destino = d;
        this.precio = p;
        this.numPlazas = nPlaz;
        this.numPasajeros = nPasa;
        this.fecha = f;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDestino() {
        return destino;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Integer getNumPlazas() {
        return numPlazas;
    }
    public Integer getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo,fecha);
    }

    @Override
    public boolean equals(Object o) {
       if(o == null || getClass() != o.getClass()) return false;
       Vuelo vuelo = (Vuelo) o;
       return Objects.equals(codigo, vuelo.codigo) && Objects.equals(fecha, vuelo.fecha);
    }
    @Override
    public String toString() {
        return this.codigo + " " + this.destino + " " + this.fecha;
    }
    @Override
    public int compareTo(Vuelo v) {
        int comparador = fecha.compareTo(v.fecha);
        if (comparador == 0) {
            comparador = codigo.compareTo(v.codigo);
        }
        return comparador;
    }
}