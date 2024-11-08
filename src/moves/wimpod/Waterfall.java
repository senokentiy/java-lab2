package moves.wimpod;

import ru.ifmo.se.pokemon.*;
import main.Main;


public final class Waterfall extends PhysicalMove
{
    public Waterfall (double pow, double acc)
    {
        super(Type.WATER, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        if (Main.chance(0.2))
        {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe()
    {
        return "uses Waterfall";
    }
}