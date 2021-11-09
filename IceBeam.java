package Moves;

import ru.ifmo.se.pokemon.*;


public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.POISON, 50, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 0);
        if (Math.random() < 0.1) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует IceBeam";
    }
}
