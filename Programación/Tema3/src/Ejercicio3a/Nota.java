package Ejercicio3a;

public class Nota {
    private double nota;
    Nota(double nota) {
        this.nota = nota;
    }
    public int redondeo(){
        return (int) Math.round(this.nota);
    }
    public String Calificacion(){
        switch (redondeo()) {
            case 5:
            case 6: return "Aprobado";
            case 7:
            case 8: return "Notable";
            case 9: return "Sobresaliente";
            case 10: return "Matrícula de honor";
            default: return "Suspenso";
            /*
            case 5,6: return "Aprobado";
            case 7,8: return "Notable";
            case 9: return "Sobresaliente";
            case 10: return "Matrícula de honor";
            default: return "Suspenso";
             */
        }
    }
}
