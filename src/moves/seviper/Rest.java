package moves.seviper;

import ru.ifmo.se.pokemon.*;


public final class Rest extends StatusMove
{
    public Rest (double pow, double acc)
    {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects (Pokemon p)
    {
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }

    @Override
    protected String describe()
    {
        return "uses Rest";
    }
}