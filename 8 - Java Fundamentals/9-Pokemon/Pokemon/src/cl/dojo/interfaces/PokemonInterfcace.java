package cl.dojo.interfaces;

import cl.dojo.librerias.Pokemon;

public interface PokemonInterfcace {
	
	Pokemon createPokemon(String name, int health, String type);
	
	String pokemonInfo(Pokemon pokemon);
	
	void listPokemon();
	
	
}
