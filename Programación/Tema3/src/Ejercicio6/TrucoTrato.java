package Ejercicio6;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class TrucoTrato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona nino = new Persona("Felipe","Rey", LocalDate.of(2015,10,9),120);

        System.out.println("¿Truco o trato?:");
        String respuesta = teclado.next();
        int sustos = 0;
        int golosinas = 0; //contadores

        if (respuesta.equalsIgnoreCase("truco")) {
            sustos += nino.getNombre().length();
            if (nino.edad() % 2 == 0) {
                sustos +=2;
            } else {
                sustos +=1;
            }
            if (nino.getAltura() > 130) {
                sustos +=3;
            }
        }
        if (respuesta.equalsIgnoreCase("trato")) {
            golosinas += nino.getNombre().length() + nino.getApellidos().length();
            if (nino.edad()<=10) {
                golosinas += 3;
            } else {
                golosinas += 2;
            }
        }
        if (nino.getAltura() <= 150) {
            golosinas += (nino.getAltura() / 50) * 2;
        }
        System.out.println(golosinas + "DULCES");
    }
}

