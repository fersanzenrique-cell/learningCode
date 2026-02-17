package Java.OOP.EmpresaApp;

class Cliente extends Persona{
    private int telf;
    Cliente (String n){
        super(n);
    }
    public int getTelf() {
        return telf;
    }
    public void setTelf(int telf) {
        this.telf = telf;
    }


}
