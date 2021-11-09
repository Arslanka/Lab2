package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Gulpin extends Pokemon {
    public Gulpin(String name, int level) {
        super(name, level);
        setStats(70, 43, 53, 43, 53, 40);
        setType(Type.POISON);
        setMove(new TailWhip(), new Swagger(), new Rest());
    }
}
