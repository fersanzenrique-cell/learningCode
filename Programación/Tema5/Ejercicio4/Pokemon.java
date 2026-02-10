package Programación.Tema5.Ejercicio4;

public class Pokemon {
    private String name;
    private double healthPoints;
    private double strikeForce;

    public Pokemon(String name, double healthPoints, double strikeForce) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strikeForce = strikeForce;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }
    public double getStrikeForce() {
        return strikeForce;
    }
    public void setStrikeForce(double strikeForce) {
        this.strikeForce = strikeForce;
    }
    public boolean isDead() {
        return getHealthPoints()<=0;
    }
    public void attack(Pokemon obj) {
        if (!isDead() && !this.isDead())
            obj.healthPoints -= strikeForce;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() +
            "/n Puntos de vida: " + getHealthPoints() +
            "/n Puntos de ataque: " + getStrikeForce();
    }

}
