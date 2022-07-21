package cl.dojo;

import cl.dojo.librerias.Pokedex;
import cl.dojo.librerias.Pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creando la Podedex con sus Pokemones");
		Pokedex dex1 = new Pokedex();
		Pokemon p1 = dex1.createPokemon("Pokemon1", 100, "Tipo1");
		System.out.println(dex1.pokemonInfo(p1));
		Pokemon p2 = dex1.createPokemon("Pokemon2", 200, "Tipo2");
		System.out.println(dex1.pokemonInfo(p2));
		Pokemon p3 = dex1.createPokemon("Pokemon3", 300, "Tipo3");
		System.out.println(dex1.pokemonInfo(p3));
		
		System.out.println("\n------------------------------------------------------");
		
		System.out.println("\nCantidad de pokemones creados: " + Pokemon.getCount());
		
		System.out.println("\n------------------------------------------------------");
		
		System.out.println("Ataque --> pokemon1 ataca a pokemon2");
		p1.attackPokemon(p2);
		System.out.println(dex1.pokemonInfo(p1));
		System.out.println(dex1.pokemonInfo(p2));
		
		System.out.println("\n------------------------------------------------------");
		
		System.out.println("Mostrando Pokedex");
		dex1.listPokemon();

		System.out.println("\n----------------------  Fin  ------------------------");
		
		
		

		
	}

}
