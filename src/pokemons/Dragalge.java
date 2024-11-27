package pokemons;

import moves.dragalge.DracoMeteor;


public class Dragalge extends Skrelp
{
    public Dragalge (String name, int level)
    {
        super(name, level);
        super.setStats(65, 75, 90,97, 123, 44);

        DracoMeteor dracoMeteor = new DracoMeteor(130, 90);

        super.addMove(dracoMeteor);
    }
}