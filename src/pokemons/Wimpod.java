package pokemons;

import moves.wimpod.*;
import ru.ifmo.se.pokemon.*;


public class Wimpod extends Pokemon
{
    public Wimpod (String name, int level)
    {
        super(name, level);
        super.setType(Type.BUG, Type.WATER);
        super.setStats(25, 35, 40,20, 30, 80);

        Facade facade = new Facade(70, 100);
        Waterfall waterfall = new Waterfall(80, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);

        super.setMove(facade, waterfall, doubleTeam);
    }
}