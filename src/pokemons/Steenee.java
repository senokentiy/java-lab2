package pokemons;

import moves.steenee.PlayNice;


public class Steenee extends Bounsweet
{
    public Steenee (String name, int level)
    {
        super(name, level);
        super.setStats(52, 40, 48,40, 48, 62);

        PlayNice playNice = new PlayNice(0, 0);

        super.addMove(playNice);
    }
}