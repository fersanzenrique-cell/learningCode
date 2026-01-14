package PiedraPapelTijera;

public class PiedraPapelTijera {
    private boolean piedra, papel , tijera;

    public PiedraPapelTijera(boolean piedra, boolean papel, boolean tijera){
        this.piedra = piedra;
        this.papel = papel;
        this.tijera = tijera;
    }

    public boolean isPapel() {
        return papel;
    }

    public boolean isPiedra() {
        return piedra;
    }

    public boolean isTijera() {
        return tijera;
    }

    public void setPapel(boolean papel) {
        this.papel = papel;
    }

    public void setPiedra(boolean piedra) {
        this.piedra = piedra;
    }

    public void setTijera(boolean tijera) {
        this.tijera = tijera;
    }
    /*
    public String partida(PiedraPapelTijera PiedraPapelTijera, boolean piedra, boolean papel, boolean tijera) {
        switch (piedra)  {
            case
        }
    }

    */
}
