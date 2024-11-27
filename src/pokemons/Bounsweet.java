package pokemons;

import moves.bounsweet.DoubleTeam;
import moves.lunatone.Swagger;
import ru.ifmo.se.pokemon.Pokemon;


public class Bounsweet extends Pokemon
{
    public Bounsweet (String name, int level)
    {
        super(name, level);
        super.setStats(42, 30, 38,30, 38, 32);

        Swagger swagger = new Swagger(0, 85);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0 );

        super.setMove(swagger, doubleTeam);
    }
}