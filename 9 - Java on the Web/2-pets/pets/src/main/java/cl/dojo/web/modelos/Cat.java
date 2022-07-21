package cl.dojo.web.modelos;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub		
		return "Your " + this.getBreed() + ", " + this.getName() + ", looked at you with some affection. You Think." ;
	}

}
