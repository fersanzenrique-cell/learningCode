package Ejercicio2;

public class Reloj {
    private int horas, minutos, segundos;

    Reloj (int horas, int minutos, int segundos) {
        this.setHoras(horas);
        this.setMinutos(minutos);
        this.setSegundos(segundos);
    }
    /*
    Reloj () {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
     */
    Reloj () {

    }
    //Es lo mismo
    Reloj (int segundosBruto) {
        this.segundos = segundosBruto % 60;
        this.minutos = (segundosBruto / 60) % 60;
        this.horas = ((segundosBruto / 60) / 60) % 24;
    }
    public void ponerEnHora(int segundosBruto) {
        this.segundos = segundosBruto % 60;
        this.minutos = (segundosBruto / 60) % 60;
        this.horas = ((segundosBruto / 60) / 60) % 24;// Intenta pasarlo a radianes
    }
    public int getHoras(){
        return this.horas;
    }
    public int getMinutos() {
        return this.minutos;
    }
    public int getSegundos() {
        return this.segundos;
    }
    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        }
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }
    public void setSegundos (int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }
    /*
    public void tick() {
        segundos++;
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if  (minutos == 60) {
            horas++;
            minutos = 0;
        }
        if (horas == 24) {
            horas = 0;
        }
    }
    */

    public void tick() {
        int segundosTotal = this.getHoras() * 3600 + this.getMinutos() * 60 + this.getSegundos() + 1;
        ponerEnHora(segundosTotal);

    }

    public String toString() {
        return String.format("0%d:0%d:0%d",getHoras(),getMinutos(),getSegundos());
    }
}
