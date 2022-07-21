package cl.dojo.librerias;

public class Bat extends Mammal{
	
	public Bat() {
		this.setEnergyLevel(300); // predeterminado para el murciélago
	}

	public String fly() {		
		this.setEnergyLevel(getEnergyLevel() - 50);

		return ("\n(sonido de murciélago despegango)\nMurciélago está volando (-50 energía)\n" + displayEnergy());
	}
	
	public String eatHumans() {		
		this.setEnergyLevel(getEnergyLevel() + 25);

		return ("\n(sonido de murciélago comiendo un ¡Humano!)\nBueno, no importa (+25 energía)\n" + displayEnergy());
	}
	
	public String attackTown() {		
		this.setEnergyLevel(getEnergyLevel() - 100);

		return ("\n(Sonido de ciudad en llamas)\nEl murciélago está atacando la ciudad (-100 energía)\n" + displayEnergy());
	}

	


	
	
}
