package moves.clefairy;

import ru.ifmo.se.pokemon.*;


public class WakeUpSlap extends PhysicalMove
{
    public WakeUpSlap (double pow, double acc)
    {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage)
    {
        super.applyOppDamage(def, damage);
        if (def.getCondition() == Status.SLEEP)
        {
            super.applyOppDamage(def, damage * 2);
        }
    }

    @Override
    protected void applyOppEffects (Pokemon p)
    {
        Effect e = new Effect().condition(Status.NORMAL);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length-1];
    }
}