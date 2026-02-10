package Programación.Tema5.Ejercicio4;

public class PokemonFuego extends Pokemon {

    public PokemonFuego(String name, double healthPoints, double strikeForce) {
        super(name,healthPoints,strikeForce);
    }


    @Override
    public void attack(Pokemon obj) {
        if (obj.getClass())
            obj.setHealthPoints(obj.getHealthPoints() - super.getStrikeForce());
    }
}
