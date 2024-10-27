package pokemons;

import moves.clefairy.*;


public class Clefairy extends Cleffa
{
    public Clefairy (String name, int level)
    {
        super(name, level);
        super.setStats(70, 45, 48,60, 65, 35);

        WakeUpSlap wakeUpSlap = new WakeUpSlap(70, 100);

        super.addMove(wakeUpSlap);
    }
}