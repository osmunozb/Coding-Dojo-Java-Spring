package cl.dojo.modelos;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "[Equipo= " + getNombreEquipo() + ", Jugadores= " + getJugadores().size() + "]";
	}
	
	
}