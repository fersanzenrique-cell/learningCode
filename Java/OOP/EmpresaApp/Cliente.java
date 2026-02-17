package Java.OOP.EmpresaApp;

public class Cliente extends Persona{
    private int telf;
    public Cliente (String n){
        super(n);
    }
    public int getTelf() {
        return telf;
    }
    public void setTelf(int telf) {
        this.telf = telf;
    }


}
