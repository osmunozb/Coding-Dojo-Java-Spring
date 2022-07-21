package cl.dojo.librerias;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		this.setEnergyLevel(100); // predeterminado para el gorila
	}

	public String throwSomething() {		
		this.setEnergyLevel(getEnergyLevel() - 5);

		return ("\nEl gorila ha lanzado algo (-5 energ�a)\n" + displayEnergy());
	}
	
	public String eatBananas() {		
		this.setEnergyLevel(getEnergyLevel() + 10);

		return ("\nEl gorila ha quedado satisfecho al comer una banana (+10 energ�a)\n" + displayEnergy());
	}
	
	public String climb() {		
		this.setEnergyLevel(getEnergyLevel() - 10);

		return ("\nEl gorila ha trepado a la cima de un �rbol (-10 energ�a)\n" + displayEnergy());
	}

	


	
	
}
