package cl.dojo;

import cl.dojo.librerias.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gorilla gorila = new Gorilla();
		System.out.println("Gorila al inicio del código --> " + gorila.displayEnergy());
		System.out.println("------------------------------------------");
		
//		hacer que lance algo tres veces
		System.out.println(gorila.throwSomething());
		System.out.println(gorila.throwSomething());
		System.out.println(gorila.throwSomething());
		System.out.println("------------------------------------------");
		
		
//		hacer que coma bananos dos veces
		System.out.println(gorila.eatBananas());
		System.out.println(gorila.eatBananas());
		System.out.println("------------------------------------------");
		
//		hacer que trepe a un árbol una vez
		System.out.println(gorila.climb());


	}

}
