package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Walrein extends Spheal {
    public Walrein(String name, int level) {
        super(name, level);
        setStats(110, 80, 90, 95, 90, 65);
        addMove(new ClearSmog());
    }
}
