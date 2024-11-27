package main;

import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main
{
    // https://pokemondb.net/pokedex/lunatone
    // https://pokemondb.net/pokedex/skrelp
    // https://pokemondb.net/pokedex/dragalge
    // https://pokemondb.net/pokedex/bounsweet
    // https://pokemondb.net/pokedex/steenee
    // https://pokemondb.net/pokedex/tsareena

    public static void main (String[] args)
    {
        Battle b = new Battle ();

        Lunatone lunatone = new Lunatone("lunatone", 1);
        Skrelp skrelp = new Skrelp("skrelp", 1);
        Dragalge dragalge = new Dragalge("dragalge", 1);
        Bounsweet bounsweet = new Bounsweet("bounsweet", 1);
        Steenee steenee = new Steenee("steenee", 1);
        Tsareena tsareena = new Tsareena("tsareena", 1);

        b.addAlly(lunatone);
        b.addAlly(skrelp);
        b.addAlly(dragalge);
        b.addFoe(bounsweet);
        b.addFoe(steenee);
        b.addFoe(tsareena);

        b.go();
    }
}

