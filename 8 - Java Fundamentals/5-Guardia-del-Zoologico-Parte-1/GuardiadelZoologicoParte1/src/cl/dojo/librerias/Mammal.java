package cl.dojo.librerias;

public class Mammal {
	
	private double energyLevel;

	public Mammal() {
		super();
	}
	
	public double getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(double energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String displayEnergy() {
		return "Nivel de energía: " + getEnergyLevel();
	}

	
		

	
	

}
