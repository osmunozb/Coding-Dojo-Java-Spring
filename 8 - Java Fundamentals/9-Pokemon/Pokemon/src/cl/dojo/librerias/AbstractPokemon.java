package cl.dojo.librerias;

import java.util.ArrayList;

import cl.dojo.interfaces.PokemonInterfcace;

public class AbstractPokemon implements PokemonInterfcace {
		
	private ArrayList<Pokemon> lista = new ArrayList<Pokemon>();
	
	public ArrayList<Pokemon> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pokemon> lista) {
		this.lista = lista;
	}

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		// TODO Auto-generated method stub
		Pokemon pokemon = new Pokemon(name, health, type);
		this.lista.add(pokemon);
		return pokemon;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return "Pokemon: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType() + "]";
	}

	@Override
	public void listPokemon() {
		// TODO Auto-generated method stub
		
	}
	
	

}
