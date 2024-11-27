package moves.lunatone;

import ru.ifmo.se.pokemon.*;


public final class CosmicPower extends StatusMove
{
    public CosmicPower (double power, double accuracy)
    {
        super(Type.PSYCHIC, power, accuracy);
    }

    @Override
    protected void applySelfEffects (Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        pokemon.setMod(Stat.DEFENSE, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe()
    {
        return "uses CosmicPower";
    }
}