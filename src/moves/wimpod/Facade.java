package moves.wimpod;

import ru.ifmo.se.pokemon.*;


public final class Facade extends PhysicalMove
{
    public Facade (double pow, double acc)
    {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage)
    {
        super.applyOppDamage(def, damage);
        if (def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE)
        {
            super.applyOppDamage(def, damage * 2);
        }
    }

    @Override
    protected String describe()
    {
        return "uses Facade";
    }
}