package moves.seviper;

import ru.ifmo.se.pokemon.*;


public class PoisonTail extends PhysicalMove
{
    public PoisonTail(double pow, double acc)
    {
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.POISON);
        p.addEffect(e);
    }

    @Override
    protected double calcCriticalHit (Pokemon att, Pokemon def)
    {
        return 1d / 8d;
    }

    @Override
    protected String describe()
    {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length-1];
    }
}
