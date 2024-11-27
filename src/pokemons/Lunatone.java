package pokemons;

import moves.lunatone.*;
import ru.ifmo.se.pokemon.Pokemon;


public final class Lunatone extends Pokemon
{
    public Lunatone(String name, int level)
    {
        super(name, level);
        super.setStats(90, 55, 65,95, 85, 70);

        CosmicPower cosmicPower = new CosmicPower(0, 0);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        Rest rest = new Rest(0, 0);
        Swagger swagger = new Swagger(0, 85);

        super.setMove(cosmicPower, chargeBeam, rest, swagger);
    }
}