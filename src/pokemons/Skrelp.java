package pokemons;

import moves.skrelp.*;
import ru.ifmo.se.pokemon.Pokemon;


public class Skrelp extends Pokemon
{
    public Skrelp(String name, int level)
    {
        super(name, level);
        super.setStats(50, 60, 60,60, 60, 30);

        AquaTail aquaTail = new AquaTail(90, 90);
        Venoshock venoshock = new Venoshock(65, 100);
        DragonPulse dragonPulse = new DragonPulse(85, 100);

        super.setMove(aquaTail, venoshock, dragonPulse);
    }
}