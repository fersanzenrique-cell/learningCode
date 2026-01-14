package Ejercicio2a1;

import java.time.LocalDate;

/**
 *
 * @author Rosa
 */
public class TFC {
    private String nombre, apellido1, apellido2;
    private String nombreT;
    private LocalDate fechaCreacion;
    private String resumen;

    public TFC(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public TFC(String nombre, String apellido1, String apellido2, String nombreT, LocalDate fechaCreacion, String resumen) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombreT = nombreT;
        this.fechaCreacion = fechaCreacion;
        this.resumen = resumen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNombreTrabajo() {
        return nombreT;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNombreTrabajo(String nombreT) {
        this.nombreT = nombreT;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String inicialesAutor() {

        String iniciales =
                        nombre.toUpperCase().substring(0,1) +
                        apellido1.toUpperCase().substring(0,1) +
                        apellido2.toUpperCase().substring(0,1);

        return iniciales;
    }

    public String autorEnLetrasCapitales() {
        String nombreCapitalizado = nombre.toUpperCase().charAt(0) + nombre.toLowerCase().substring(1);
        String apellido1Capitalizado = apellido1.toUpperCase().charAt(0) + apellido1.toLowerCase().substring(1);
        String apellido2Capitalizado = apellido2.toUpperCase().charAt(0) + apellido2.toLowerCase().substring(1);

        return nombreCapitalizado + " " + apellido1Capitalizado + " " + apellido2Capitalizado + ".";
    }
    public int numeroPalabras() {
        int palabrasResumen = resumen.split(" ").length;
        return palabrasResumen;
    }
    public int ocurrenciasDeLetra(char letra) {

        int ocurrencias = 0;

        for (int i = 0; i < resumen.length(); i++) {
            String resumenChar = String.valueOf(resumen.charAt(i));
            if (resumenChar.equalsIgnoreCase(String.valueOf(letra))) { // si queremos que identifique la misma letra en mayuscula y minuscula
                ocurrencias++;
            }
        }
        return ocurrencias;
    }
}

