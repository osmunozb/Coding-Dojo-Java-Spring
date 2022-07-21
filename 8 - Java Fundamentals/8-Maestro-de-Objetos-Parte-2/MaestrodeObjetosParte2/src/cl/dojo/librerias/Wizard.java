package cl.dojo.librerias;

public class Wizard extends Human{

	public Wizard(String name) {
		super(name);
		setHealth(50);
		setIntelligence(8);
	}
	
	public void heal(Human sanar) {
		System.out.println("Vida inicial del personaje "+ sanar.getName() +" de la clase " + sanar.getClass().getSimpleName()+ " es: " + sanar.getHealth());
		sanar.setHealth(sanar.getHealth() + this.getIntelligence());
		System.out.println("El personaje " + this.getName() + " de la clase " + this.getClass().getSimpleName() + " ha sanado a " + sanar.getName() + " en: " + this.getIntelligence());
		System.out.println("Vida final del personaje "+ sanar.getName() +" de la clase " + sanar.getClass().getSimpleName()+ " es: " + sanar.getHealth());
	}
	
	public void fireBalll(Human quemado) {
		System.out.println("Vida inicial del personaje "+ quemado.getName() +" de la clase " + quemado.getClass().getSimpleName()+ " es: " + quemado.getHealth());
		quemado.setHealth(quemado.getHealth() - this.getIntelligence()*3);
		System.out.println("El personaje " + this.getName() + " de la clase " + this.getClass().getSimpleName() + " ha lanzado una bola de fuego a " + quemado.getName() + ", esta causa un daño de: " + this.getIntelligence()*3);
		System.out.println("Vida final del personaje "+ quemado.getName() +" de la clase " + quemado.getClass().getSimpleName()+ " es: " + quemado.getHealth());
	}
	
	
	
	
	
	
	
}
