package cl.dojo.librerias;


public class Pokedex extends AbstractPokemon{
		
	private int myPokemons;
	
	public int getMyPokemons() {
		return myPokemons;
	}
	public void setMyPokemons(int myPokemons) {
		this.myPokemons = myPokemons;
	}

	public void listPokemon() {
		System.out.println("Lista de Pokemones en la Pokedex \n");
		for (Pokemon pokemon : getLista()) {
			System.out.println(pokemon.getName());
			myPokemons++;
		}
		System.out.println("\nTotal de Pokemones en esta Pokedex: " + getMyPokemons());
		
	}

}
