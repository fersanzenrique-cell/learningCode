package Ejercicio3a;

public class NotaBis {
    private double nota;
    NotaBis(double nota) {
        this.nota = nota;
    }
    public int redondeo(){
        return (int) Math.round(this.nota);
    }
    public String Calificacion(){
        String notaString = "";
        if (nota>=0 && nota<5) {
            notaString = "suspenso";
        } else if (nota>5 && nota<7) {
            notaString = "aprobado";
        } else if (nota>7 && nota<9) {
            notaString = "notable";
        } else if (nota>9 && nota<10) {
            notaString = "sobresaliente";
        } else if (nota==10) {
            notaString = "matricula de honor";
        } else {
            notaString = "fuera de rango";
        }
       return notaString;
    }
}
