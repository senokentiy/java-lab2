package main;

import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main
{
    // https://pokemondb.net/pokedex/seviper
    // https://pokemondb.net/pokedex/wimpod
    // https://pokemondb.net/pokedex/golisopod
    // https://pokemondb.net/pokedex/cleffa
    // https://pokemondb.net/pokedex/clefairy
    // https://pokemondb.net/pokedex/clefable

    public static void main (String[] args)
    {
        Battle b = new Battle ();

        Seviper seviper = new Seviper("seviper", 1);
        Wimpod wimpod = new Wimpod("wimpod", 1);
        Golisopod golisopod = new Golisopod("golisopod", 1);
        Cleffa cleffa = new Cleffa("cleffa", 1);
        Clefairy clefairy = new Clefairy("clefairy", 1);
        Clefable clefable = new Clefable("clefable", 1);

        b.addAlly(seviper);
        b.addAlly(wimpod);
        b.addAlly(golisopod);
        b.addFoe(cleffa);
        b.addFoe(clefairy);
        b.addFoe(clefable);

        b.go();
    }

    public static boolean chance (double num)
    {
        return num > Math.random();
    }
}

