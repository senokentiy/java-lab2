package moves.cleffa;

import ru.ifmo.se.pokemon.*;


public final class Flamethrower extends SpecialMove
{
    public Flamethrower (double pow, double acc)
    {
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.BURN);
        p.addEffect(e);
    }

    @Override
    protected String describe()
    {
        return "uses Flamethrower";
    }
}