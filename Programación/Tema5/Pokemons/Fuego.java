package Programación.Tema5.Pokemons;

public class Fuego extends Pokemon{

    public Fuego(String nombre, double healthPoints, double strikeForce) {
        super(nombre, healthPoints, strikeForce);
    }

    @Override
    public void attack(Pokemon p) {
    /*
    Cuando un Pokemon Fuego ataca a un Pokemon Planta, a éste se le
    deducen 2 * fuerzaDeAtaque puntos de la vida. Sin embargo son
    muy poco eficaces cuando se enfrentan a un Pokemon Agua o a uno Fuego.
    En estos casos, al Pokemon atacado sólo se les deduce 0.5* fuerzaDeAtaque.
    A los Pokemon normales les dan la caña normal (deducción de fuerzaDeAtaque puntos)
     */
        if (!(this.isDead() || p.isDead()  )) {
            if (p instanceof Planta) {
                p.setHealthPoints(p.getHealthPoints() - 2 * this.getStrikeForce());
            } else if (p instanceof Agua || p instanceof Fuego) {
                p.setHealthPoints(p.getHealthPoints() - 0.5 * this.getStrikeForce());
            } else {
                super.attack(p);
            }
        }
    }
}
