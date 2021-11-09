package Moves;

import ru.ifmo.se.pokemon.*;

public class PinMissile extends PhysicalMove {
    public PinMissile() {
        super(Type.BUG, 25, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        double probability = Math.random();
        if (probability < 0.375) {
            p.addEffect(new Effect().turns(2).stat(Stat.ATTACK, 50));
        } else if (probability < 0.75) {
            p.addEffect(new Effect().turns(3).stat(Stat.ATTACK, 75));
        } else if (probability < 0.875) {
            p.addEffect(new Effect().turns(4).stat(Stat.ATTACK, 100));
        } else {
            p.addEffect(new Effect().turns(5).stat(Stat.ATTACK, 125));
        }
    }

    @Override
    protected String describe() {
        return "использует Pim Missile";
    }
}