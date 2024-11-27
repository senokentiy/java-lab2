package moves.lunatone;

import ru.ifmo.se.pokemon.*;


public final class Rest extends StatusMove
{
    public Rest (double power, double accuracy)
    {
        super(Type.PSYCHIC, power, accuracy);
    }

    @Override
    protected void applySelfEffects (Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        Effect effect = new Effect().turns(2).condition(Status.SLEEP);
        pokemon.addEffect(effect);

        pokemon.setMod(Stat.HP, (int) pokemon.getStat(Stat.HP));
    }

    @Override
    protected String describe()
    {
        return "uses Rest";
    }
}