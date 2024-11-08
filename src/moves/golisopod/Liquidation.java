package moves.golisopod;

import ru.ifmo.se.pokemon.*;


public final class Liquidation extends PhysicalMove
{
    public Liquidation (double pow, double acc)
    {
        super(Type.WATER, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe()
    {
        return "uses Liquidation";
    }
}