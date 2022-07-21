package cl.dojo.librerias;

public class Human {
	
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public Human() {
		super();
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Human [Strength()=" + getStrength() + ", Stealth()=" + getStealth() + ", Intelligence()="
				+ getIntelligence() + ", Health()=" + getHealth() + "]";
	}
	
	public void attack(Human atacado) {
		atacado.setHealth(atacado.getHealth()-this.strength);
		System.out.println("vida del humano atacado disminuida a: " + atacado.getHealth());
	}
	
	

	
	
}
