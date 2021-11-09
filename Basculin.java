package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Basculin extends Pokemon {
    public Basculin(String name, int level) {
        super(name, level);
        setStats(70, 92, 65, 80, 55, 98);
        setType(Type.POISON);
        setMove(new ThunderWave(), new Astonish(), new Supersonic(), new PinMissile());
    }
}
