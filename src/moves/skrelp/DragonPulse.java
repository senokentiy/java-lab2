package moves.skrelp;

import ru.ifmo.se.pokemon.*;


public final class DragonPulse extends SpecialMove
{
    public DragonPulse (double power, double accuracy)
    {
        super(Type.DRAGON, power, accuracy);
    }

    @Override
    protected String describe()
    {
        return "uses DragonPulse";
    }
}