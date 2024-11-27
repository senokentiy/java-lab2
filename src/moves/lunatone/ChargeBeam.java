

package moves.lunatone;

import ru.ifmo.se.pokemon.*;


public final class ChargeBeam extends SpecialMove
{
    public ChargeBeam (double power, double accuracy)
    {
        super(Type.ELECTRIC, power, accuracy);
    }

    @Override
    protected void applySelfEffects (Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        if (chance(0.7))
        {
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    private static boolean chance (double value)
    {
        return value > Math.random();
    }

    @Override
    protected String describe()
    {
        return "uses ChargeBeam";
    }
}