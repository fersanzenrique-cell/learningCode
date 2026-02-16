package Programación.Tema5.Pokemons;

public class Agua extends Pokemon{
    private static String tipo = "Agua";
    public Agua(String nombre, double healthPoints, double strikeForce) {
        super(nombre, healthPoints, strikeForce);
    }

    @Override
    public void attack(Pokemon p) {
        /*
        Los Pokemon Agua son súper eficaces contra los Pokemon Fuego y les zurran el doble
        (2 * fuerzaDeAtaque). Sin embargo son la mitad de eficaces cuando se enfrentan a un
        Pokemon Agua o a uno Planta (0.5* FuerzaDeAtaque). . A los Pokemon normales les dan
        la caña normal (deducción de fuerzaDeAtaque puntos).
         */
        if (!(this.isDead() || p.isDead()  )) {
            if (p instanceof Fuego) {
                p.setHealthPoints(p.getHealthPoints() - 2 * this.getStrikeForce());
            } else if (p instanceof Agua || p instanceof Planta) {
                p.setHealthPoints(p.getHealthPoints() - 0.5 * this.getStrikeForce());
            } else {
                super.attack(p);
            }
        }
    }
}
