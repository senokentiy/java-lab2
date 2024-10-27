package moves.seviper;

import main.Main;
import ru.ifmo.se.pokemon.*;


public class DarkPulse extends SpecialMove
{
    public DarkPulse (double pow, double acc)
    {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        super.applyOppEffects(p);
        if (Main.chance(0.2))
            Effect.flinch(p);
    }

    @Override
    protected String describe ()
    {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length-1];
    }
}