package moves.dragalge;

import ru.ifmo.se.pokemon.*;


public final class DracoMeteor extends SpecialMove
{
    public DracoMeteor (double power, double accuracy)
    {
        super(Type.DRAGON, power, accuracy);
    }

    @Override
    protected void applySelfEffects (Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe()
    {
        return "uses DracoMeteor";
    }
}