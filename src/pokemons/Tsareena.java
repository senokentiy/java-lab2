package pokemons;

import moves.lunatone.Rest;


public final class Tsareena extends Steenee
{
    public Tsareena (String name, int level)
    {
        super(name, level);
        super.setStats(72, 120, 98,50, 98, 72);

        Rest rest = new Rest(0, 0);

        super.addMove(rest);
    }
}