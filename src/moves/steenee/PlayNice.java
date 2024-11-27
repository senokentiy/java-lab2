package moves.steenee;

import ru.ifmo.se.pokemon.*;


public final class PlayNice extends StatusMove
{
    public PlayNice (double power, double accuracy)
    {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        super.applyOppEffects(pokemon);

        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe()
    {
        return "uses PlayNice";
    }
}