package moves.skrelp;

import ru.ifmo.se.pokemon.*;


public final class AquaTail extends PhysicalMove
{
    public AquaTail (double power, double accuracy)
    {
        super(Type.WATER, power, accuracy);
    }

    @Override
    protected String describe()
    {
        return "uses AquaTail";
    }
}