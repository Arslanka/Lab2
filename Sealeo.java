package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Sealeo extends Spheal {
    public Sealeo(String name, int level) {
        super(name, level);
        setStats(90, 60, 70, 75, 70, 45);
        addMove(new WingAttack());
    }
}
