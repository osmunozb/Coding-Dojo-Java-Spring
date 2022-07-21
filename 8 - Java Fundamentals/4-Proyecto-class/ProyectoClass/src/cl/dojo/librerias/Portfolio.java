package cl.dojo.librerias;

import java.util.ArrayList;

public class Portfolio {

	ArrayList<Project> portafolio = new ArrayList<Project>();

	public void addProyecto(Project proyecto) {
		this.portafolio.add(proyecto);
	}
	
//	costo total del portafolio
	public double getPortfolioCost() {
		double total = 0;
		for (Project proyecto : this.portafolio) {
			total = total + proyecto.getInitialCost();
		}
		return total;
	}
	
//	portafolio y su costo total
	public void showPortfolio() {
		for (Project proyecto : this.portafolio) {
			System.out.println(proyecto.elevatorPitch());
		}
		System.out.println("\nCosto total del portafolio: $" + getPortfolioCost());
	}
	
	
}
