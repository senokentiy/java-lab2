package moves.wimpod;

import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove
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
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length-1];
    }
}