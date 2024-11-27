package moves.skrelp;

import ru.ifmo.se.pokemon.*;


public final class Venoshock extends SpecialMove
{
    public Venoshock (double power, double accuracy)
    {
        super(Type.POISON, power, accuracy);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage)
    {

        if (pokemon.getCondition() == Status.POISON)
        {
            super.applyOppDamage(pokemon, damage * 2);
        }
        else
        {
            super.applyOppDamage(pokemon, damage);
        }
    }

    @Override
    protected String describe()
    {
        return "uses Venoshock";
    }
}