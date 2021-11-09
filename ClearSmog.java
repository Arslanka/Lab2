package Moves;

import ru.ifmo.se.pokemon.*;

public class ClearSmog extends StatusMove {
    public ClearSmog() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.restore();
    }

    @Override
    protected String describe() {
        return "использует Clear Smog";
    }
}
