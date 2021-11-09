package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Swalot extends Gulpin {
    public Swalot(String name, int level) {
        super(name, level);
        setStats(100, 73, 83, 73, 83, 55);
        addMove(new IceBeam());
    }
}
