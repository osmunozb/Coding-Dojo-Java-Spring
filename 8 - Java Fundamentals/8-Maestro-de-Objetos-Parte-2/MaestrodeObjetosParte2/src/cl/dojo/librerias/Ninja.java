package cl.dojo.librerias;

public class Ninja extends Human{
	
	public Ninja(String name) {
		super(name);
		setStealth(10);
	}
	
	public void steal(Human robado) {
		System.out.println("Vida inicial del personaje "+ robado.getName() +" de la clase " + robado.getClass().getSimpleName()+ " es: " + robado.getHealth());
		System.out.println("Vida inicial del personaje "+ this.getName() +" de la clase " + this.getClass().getSimpleName()+ " es: " + this.getHealth());
		robado.setHealth(robado.getHealth() - this.getStealth());
		this.setHealth(this.getHealth() + this.getStealth());
		System.out.println("El personaje " + this.getName() + " de la clase " + this.getClass().getSimpleName() + " ha robado " + this.getStealth() + " de vida a " + robado.getName());
		System.out.println("Vida final del personaje "+ robado.getName() +" de la clase " + robado.getClass().getSimpleName()+ " es: " + robado.getHealth());
		System.out.println("Vida final del ladrón "+ this.getName() +" de la clase " + this.getClass().getSimpleName()+ " es: " + this.getHealth());
	}
	
	
	public void runAway() {
		System.out.println("Vida inicial de " + this.getName() + " de la clase " + this.getClass().getSimpleName()+ " es: " + this.getHealth());
		this.setHealth(this.getHealth()-10);
		System.out.println(this.getName() + " de la clase " + this.getClass().getSimpleName() + " ha huido, él pierde 10 de vida, su vida ahora es de:  " + this.getHealth());
	}
	
	
	
	
}
