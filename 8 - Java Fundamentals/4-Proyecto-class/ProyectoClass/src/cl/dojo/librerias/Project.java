package cl.dojo.librerias;

public class Project {
	
//	variables
	public String nombre;
	public String descripcion;
	public double initialCost;
	
//	sobrecarga del metodo
	public Project() {
		super();
	}
	
	public Project(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Project(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public Project(String nombre, String descripcion, double initialCost) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}
	
//	getter y setter para cada campo
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
//	elevatorPitch
	public String elevatorPitch() {
		return getNombre() + " (" + getInitialCost() + "): "   + getDescripcion();
	}
	
	
	
	
	
	
	
	
	

}
