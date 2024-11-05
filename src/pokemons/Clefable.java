package pokemons;

import moves.clefable.*;


public final class Clefable extends Clefairy
{
    public Clefable (String name, int level)
    {
        super(name, level);
        super.setStats(95, 70, 73,95, 90, 60);

        Thunder thunder = new Thunder(110, 70);

        super.addMove(thunder);
    }
}