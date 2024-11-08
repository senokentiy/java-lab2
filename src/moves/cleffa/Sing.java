package moves.cleffa;

import ru.ifmo.se.pokemon.*;


public final class Sing extends StatusMove
{
    public Sing (double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().turns(3).condition(Status.SLEEP);
        p.addEffect(e);
    }

    @Override
    protected String describe()
    {
        return "uses Sing";
    }
}