package cl.dojo;

import cl.dojo.librerias.Portfolio;
import cl.dojo.librerias.Project;

public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project proyecto1 = new Project();
		Project proyecto2 = new Project("Segundo proyecto");
		Project proyecto3 = new Project("Tercer proyecto", "Esta es la descripcion del tercer proyecto ...");
		Project proyecto4 = new Project("Cuarto proyecto", "Esta es la descripcion del cuarto proyecto ...", 4400);
		
		System.out.println("--------------------------------Sobrecarga--------------------------------\n");
		System.out.println("objeto sin valores en sus atributos --> " + proyecto1.elevatorPitch());
		System.out.println("objeto solo con atributo (nombre) --> " + proyecto2.elevatorPitch());
		System.out.println("objeto con atributos (nombre) y (descripcion) -->" +proyecto3.elevatorPitch());
		System.out.println("objeto con todos sus atributos (nombre), (descripcion) y (initialCost) --> " + proyecto4.elevatorPitch());
		
//		se agregan los valores faltantes de los proyectos para incluirlos en el portafolio
//		proyecto1
		proyecto1.setNombre("Primer proyecto");
		proyecto1.setDescripcion("Esta es la descripcion del primer proyecto ...");
		proyecto1.setInitialCost(1100);
//		proyecto2
		proyecto2.setDescripcion("Esta es la descripcion del segundo proyecto ...");
		proyecto2.setInitialCost(2200);
//		proyecto3
		proyecto3.setInitialCost(3300);
		
//		se crea el portafolio
		Portfolio portafolio = new Portfolio();
		portafolio.addProyecto(proyecto1);
		portafolio.addProyecto(proyecto2);
		portafolio.addProyecto(proyecto3);
		portafolio.addProyecto(proyecto4);
		
		System.out.println("\n----------------Proyectos con todos los valores ingresados----------------\n");
		System.out.println(proyecto1.elevatorPitch());
		System.out.println(proyecto2.elevatorPitch());
		System.out.println(proyecto3.elevatorPitch());
		System.out.println(proyecto4.elevatorPitch());
		
//		costo total del portafolio
		System.out.println("\n-----------------------Costo total de los proyectos-----------------------\n");
		System.out.println(portafolio.getPortfolioCost());
		
//		mostrar el portafolio
		System.out.println("\n-----------------------Portafolio y su costo total-----------------------\n");
		
		portafolio.showPortfolio();
		
	}

}
