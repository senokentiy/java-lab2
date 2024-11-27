package moves.lunatone;

import ru.ifmo.se.pokemon.*;


public final class Swagger extends StatusMove
    {
    public Swagger(double power, double accuracy)
    {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        super.applyOppEffects(pokemon);

        pokemon.confuse();
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        super.applySelfEffects(pokemon);

        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe()
    {
        return "uses Swagger";
    }
}