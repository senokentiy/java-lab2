package moves.bounsweet;

import ru.ifmo.se.pokemon.*;


public final class DoubleTeam extends StatusMove
{
    public DoubleTeam (double power, double accuracy)
    {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applySelfEffects (Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        Effect effect = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe()
    {
        return "uses DoubleTeam";
    }
}