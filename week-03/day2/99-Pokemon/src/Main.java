/*
Every pokemon has a name and a type. Certain types are effective against others, e.g. water is effective against fire.

You have a Pokemon class with a method called isEffectiveAgainst().

Ash currently has 5 pokemon. Help Ash decide which Pokemon to use against the wild one.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire

        // Ash currently has 5 pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?
        int i = 0;
        do {
            i++;
        } while (!pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon));
        System.out.print("I choose you, " + pokemonOfAsh.get(i).name);

    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}