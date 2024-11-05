package pokemons;

import moves.golisopod.*;


public final class Golisopod extends Wimpod
{
    public Golisopod (String name, int level)
    {
        super(name, level);
        super.setStats(75, 125, 140,60, 90, 40);

        Liquidation liquidation = new Liquidation(85, 100);

        super.addMove(liquidation);
    }
}