package Programación.Tema5.Pokemons;

public class Pokemon {
    private static String tipo = "Pokemon";
    private String nombre;
    private double healthPoints;
    private double strikeForce;

    public Pokemon(String nombre, double healthPoints, double strikeForce) {
        this.nombre = nombre;
        setHealthPoints(healthPoints);
        setStrikeForce(strikeForce);
    }

    public static String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public double getHealthPoints() {
        return healthPoints;
    }
    public double getStrikeForce() {
        return strikeForce;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHealthPoints(double healthPoints) {
        // filtro para que los puntos de vida nunca sean negativos
        if (healthPoints >= 0)
            this.healthPoints = healthPoints;
        else
            this.healthPoints = 0;
    }
    public void setStrikeForce(double strikeForce) {
        // filtro para que los puntos de fuerza de ataque nunca sean negativos
        if(strikeForce >= 0)
            this.strikeForce = strikeForce;
        else
            this.strikeForce = 0;
    }
    public boolean isDead(){
       return healthPoints <= 0;
    }
    public void attack(Pokemon p){
        if (!(this.isDead() || p.isDead()  )) {
            p.setHealthPoints(p.healthPoints - this.strikeForce);
        }
    }
    @Override
    public String toString() {
        return getNombre() + '\t' + getHealthPoints() + '\t' +   getStrikeForce();
    }
}
