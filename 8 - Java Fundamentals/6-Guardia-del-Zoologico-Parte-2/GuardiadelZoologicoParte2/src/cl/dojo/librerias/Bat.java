package cl.dojo.librerias;

public class Bat extends Mammal{
	
	public Bat() {
		this.setEnergyLevel(300); // predeterminado para el murci�lago
	}

	public String fly() {		
		this.setEnergyLevel(getEnergyLevel() - 50);

		return ("\n(sonido de murci�lago despegango)\nMurci�lago est� volando (-50 energ�a)\n" + displayEnergy());
	}
	
	public String eatHumans() {		
		this.setEnergyLevel(getEnergyLevel() + 25);

		return ("\n(sonido de murci�lago comiendo un �Humano!)\nBueno, no importa (+25 energ�a)\n" + displayEnergy());
	}
	
	public String attackTown() {		
		this.setEnergyLevel(getEnergyLevel() - 100);

		return ("\n(Sonido de ciudad en llamas)\nEl murci�lago est� atacando la ciudad (-100 energ�a)\n" + displayEnergy());
	}

	


	
	
}
