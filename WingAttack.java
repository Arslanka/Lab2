package Moves;

import ru.ifmo.se.pokemon.*;

public class WingAttack extends PhysicalMove {
    public WingAttack() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 0);
    }

    @Override
    protected String describe() {
        return "использует Tail Whip";
    }
}
