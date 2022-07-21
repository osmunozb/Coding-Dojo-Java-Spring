package cl.dojo.librerias;

public class Samurai extends Human{
	
	private static int contador;
	
	public Samurai(String name) {
		super(name);
		this.setHealth(200);
		contador++;
	}
	
	public void deathBlow(Human asesinado) {
		System.out.println(this.getName() + "de la clase " + this.getClass().getSimpleName() +" tiene una vida de: " + this.getHealth());
		System.out.println(asesinado.getName() + " de la clase " + asesinado.getClass().getSimpleName() + " tine una vida de: " + asesinado.getHealth());
		System.out.println(this.getName() + "de la clase " + this.getClass().getSimpleName() + " va a asesinar a " + asesinado.getName() + " de la clase " + asesinado.getClass().getSimpleName());
		asesinado.setHealth(0);
		System.out.println(asesinado.getName() + " de la clase " + asesinado.getClass().getSimpleName() + "ha muerto, su vida es de: " + asesinado.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println("La vida de "  + this.getName() + " de la clase " + this.getClass().getSimpleName() + " se ha reducido a la mitad luego del asesinato, su vida ahora es de: " + this.getHealth());
		if(asesinado.getClass() == this.getClass()) {
			contador--;
		}
	}
	
	public void meditate() {
		System.out.println(this.getName() + " de la clase " + this.getClass().getSimpleName() + " tiene una vida incial de: " + this.getHealth());
		System.out.println("El Samurai comienza a meditar ....");
		System.out.println("El Samurai se ha librado de las ideas de miedo, ira y ego. Los Dioses le premian dandole puntos de vida (" +this.getHealth()/2 + ") ...");
		this.setHealth(this.getHealth()+ this.getHealth()/2);
		System.out.println(this.getName() + " de la clase " + this.getClass().getSimpleName() + " tiene una vida final de: " + this.getHealth());
	}
	
	
	public void howMany() {	
		System.out.println("La cantidad de Samurais es: " + contador);
	}
	

	
	

	
}
