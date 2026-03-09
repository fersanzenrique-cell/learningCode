package Programación.Tema6.EjerciciosColecciones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrincipalAeropuerto {
    public static void main(String[] args) {
        Aeropuerto barajas = new Aeropuerto("Barajas");
        Vuelo v1 = new Vuelo("UX1234", "Agartha", 67.23, 23, 22, LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 35)));
        Vuelo v3 = new Vuelo("UX1235", "Agartha", 120.23, 12, 10, LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 40)));
        Vuelo v2 = new Vuelo("UX3421", "Paris", 107.23, 53, 26, LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 30)));
        Vuelo v4 = new Vuelo("UX0953", "Berlin", 27.23, 43, 13, LocalDateTime.of(LocalDate.now(), LocalTime.of(11, 10)));
        Vuelo v5 = new Vuelo("UX3403", "Roma", 55.54, 73, 58, LocalDateTime.of(LocalDate.now(), LocalTime.of(16, 20)));

        barajas.addVuelo(v1);
        barajas.addVuelo(v2);
        barajas.addVuelo(v3);
        barajas.addVuelo(v4);
        barajas.addVuelo(v5);
        System.out.println(barajas.toString());
    }
}
