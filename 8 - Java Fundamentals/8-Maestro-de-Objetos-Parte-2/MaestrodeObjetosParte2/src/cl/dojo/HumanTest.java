package cl.dojo;

//import cl.dojo.librerias.Human;
import cl.dojo.librerias.Ninja;
import cl.dojo.librerias.Samurai;
import cl.dojo.librerias.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wizard wizard1 = new Wizard("Gandalf");
		Ninja ninja1 = new Ninja("Hatsumi");
		Samurai samurai1 =new Samurai("Takeda");
		Samurai samurai2 =new Samurai("Miyamoto");

		
//		Bola de fuego
		System.out.println("Un humano de la clase Wizard va a lanzar una bola de fuego ... \n");
		wizard1.fireBalll(ninja1);
		System.out.println("\n------------------------------------------------------------------\n");
		
//		Curación
		System.out.println("Un humano de la clase Wizard va a curar ... \n");
		wizard1.heal(ninja1);
		System.out.println("\n------------------------------------------------------------------\n");
		
//		Robo de vida
		System.out.println("Un humano de la clase Ninja va a robar vida ... \n");
		ninja1.steal(wizard1);
		System.out.println("\n------------------------------------------------------------------\n");

//		Huir
		System.out.println("Un humano de la clase Ninja va a huir ... \n");
		ninja1.runAway();
		System.out.println("\n------------------------------------------------------------------\n");
		
		
//		Cantidad de Samurais 
		System.out.println("Contando Samurais  ... \n");
		samurai1.howMany();
		System.out.println("\n------------------------------------------------------------------\n");
		
//		Asesinar 
		System.out.println("Un humano de la clase Samurai va a asesinar ... \n");
		samurai1.deathBlow(samurai2);
		System.out.println("\n------------------------------------------------------------------\n");
		
//		Cantidad de Samurais después del asesinato de un Samurai
		System.out.println("Contando Samurais después de la muerte de un Samurai ... \n");
		samurai1.howMany();
		System.out.println("\n------------------------------------------------------------------\n");
		
//		Que el Samurai medite
		System.out.println("Un Humano de la clase Samurai va a meditar ... \n");
		samurai1.meditate();
		System.out.println("\n--------------------------- Fin ----------------------------------\n");
		
		
		



		
	}

}
