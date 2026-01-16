package Ejercicio2a1;

import java.time.LocalDate;

public class HistoriasTFC {

    public static void main(String[] args) {
        TFC tfc1 = new TFC("Enrique", "Fernández", "Sanz");
        TFC tfc2 = new TFC("Dexter", "Morgan", "Moser", "Estudiante de medicina", LocalDate.of(2000,5,19), "El presente trabajo tiene como objetivo analizar las reacciones fisiológicas del cuerpo humano ante la pérdida significativa de sangre y los mecanismos de compensación que permiten la supervivencia en condiciones de trauma agudo. A través de observaciones clínicas, modelos experimentales y simulaciones controladas, se estudian los procesos de coagulación, la redistribución del flujo sanguíneo y la activación de respuestas neuroendocrinas frente al shock hipovolémico.");
        System.out.println(tfc1.inicialesAutor());
        System.out.println(tfc1.autorEnLetrasCapitales());
        System.out.println(tfc2.numeroPalabras());
        System.out.println(tfc2.ocurrenciasDeLetra('a'));

        
    }
}
