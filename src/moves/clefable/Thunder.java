package moves.clefable;

import ru.ifmo.se.pokemon.*;


public final class Thunder extends SpecialMove
{
    public Thunder (double pow, double acc)
    {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe()
    {
        return "uses Thunder";
    }
}