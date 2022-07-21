package cl.dojo;

import cl.dojo.librerias.Human;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human humano1 = new Human();
		Human humano2 = new Human();
		
		System.out.println("humano1 --> " + humano1);
		System.out.println("humano2 --> " + humano2);
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println("humano1 ataca a humano2");
		humano1.attack(humano2);
		System.out.println("humano1 --> " + humano1);
		System.out.println("humano2 --> " + humano2);
		System.out.println("------------------------------------------------------------------------\n");
		System.out.println("humano1 ataca a humano2");
		humano1.attack(humano2);
		System.out.println("humano1 --> " + humano1);
		System.out.println("humano2 --> " + humano2);


		
	}

}
