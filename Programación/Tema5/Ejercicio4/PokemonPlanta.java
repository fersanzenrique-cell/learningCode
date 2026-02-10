package Programación.Tema5.Ejercicio4;

public class PokemonPlanta extends Pokemon {

    public PokemonPlanta(String name, double healthPoints, double strikeForce) {
        super(name,healthPoints,strikeForce);
    }

    @Override
    public void attack(Pokemon obj) {
        obj.healthPoints -= super.strikeForce;
    }
}
