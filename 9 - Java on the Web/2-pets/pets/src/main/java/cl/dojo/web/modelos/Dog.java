package cl.dojo.web.modelos;

public class Dog extends Animal implements Pet {

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		if (this.getWeight() < 30 ) {
			
			return this.getName() + " hopped into your lap and cuddle you.";
		} else {
			return this.getName() + " curled up next to you.";
		}
		
		
		
		
	}

	
	
}
