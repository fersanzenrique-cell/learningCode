package Programación.Tema5.Pokemons;

public class Planta extends Pokemon{
    public Planta(String nombre, double healthPoints, double strikeForce) {
        super(nombre, healthPoints, strikeForce);
    }

    @Override
    public void attack(Pokemon p) {
        /*  Los Pokemon Planta son súper eficaces contra los Pokemon Agua y
            les zurran el doble (2 * FuerzaDeAtaque). Sin embargo, son la mitad
            de eficaces cuando se enfrentan a un Pokemon Planta o Fuego (0.5* fuerzaDeAtaque).
            A los Pokemon normales les dan la caña normal (deducción de fuerzaDeAtaque puntos).
         */
        if (!(this.isDead() || p.isDead()  )) {
            if (p instanceof Agua) {
                p.setHealthPoints(p.getHealthPoints() - 2 * this.getStrikeForce());
            } else if (p instanceof Fuego || p instanceof Planta) {
                p.setHealthPoints(p.getHealthPoints() - 0.5 * this.getStrikeForce());
            } else {
                super.attack(p);
            }
        }
    }
}
