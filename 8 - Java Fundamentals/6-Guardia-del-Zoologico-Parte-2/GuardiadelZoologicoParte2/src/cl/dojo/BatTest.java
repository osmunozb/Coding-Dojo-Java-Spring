package cl.dojo;

import cl.dojo.librerias.Bat;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bat murcielago = new Bat();
		System.out.println("Murciélago al inicio del código --> " + murcielago.displayEnergy());
		System.out.println("------------------------------------------");
		
//		ataca la ciudad tres veces
		System.out.println(murcielago.attackTown());
		System.out.println(murcielago.attackTown());
		System.out.println(murcielago.attackTown());
		System.out.println("------------------------------------------");
		
//		come dos humanos
		System.out.println(murcielago.eatHumans());
		System.out.println(murcielago.eatHumans());
		System.out.println("------------------------------------------");
		
//		vuela dos veces
		System.out.println(murcielago.fly());
		System.out.println(murcielago.fly());
		


	}

}
