package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Spheal extends Pokemon {
    public Spheal(String name, int level) {
        super(name, level);
        setStats(70, 40, 50, 55, 50, 25);
        setType(Type.ICE);
        setMove(new Confide(), new Swagger());
    }
}
