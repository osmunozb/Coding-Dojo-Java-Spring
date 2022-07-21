package cl.dojo.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.dojo.modelos.Equipo;
import cl.dojo.modelos.Jugador;

@WebServlet("/jugadores")
public class Jugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		int idSelecionado = Integer.parseInt(request.getParameter("id"));
		System.out.println("(id) de equipo en el que se va a agregar un jugador: " + idSelecionado);
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		System.out.println(listaEquipos.get(idSelecionado));
		System.out.println("---------------------------------------------");
		Equipo equipoSelecionado = listaEquipos.get(idSelecionado);
		ArrayList<Jugador> jugadoresEquipo = equipoSelecionado.getJugadores();
		request.setAttribute("jugadoresEquipo", jugadoresEquipo);
		request.setAttribute("equipoSelecionado", equipoSelecionado);
		request.setAttribute("idSelecionado", idSelecionado);
		request.getRequestDispatcher("/WEB-INF/vistas/nuevoJugador.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		int idSelecionado = Integer.parseInt(request.getParameter("id"));
		System.out.println("Equipo al cual se le va a agregar un jugador " + listaEquipos.get(idSelecionado));
		Equipo equipoSelecionado = listaEquipos.get(idSelecionado);
		String nombreJugador = request.getParameter("nombreJugador");
		String apellidoJugador = request.getParameter("apellidoJugador");
		int edad = Integer.parseInt(request.getParameter("edad"));
		Jugador nuevoJugador = new Jugador(nombreJugador, apellidoJugador, edad);
		System.out.println("Jugador ingresado: " + nuevoJugador);
		System.out.println("---------------------------------------------");
		equipoSelecionado.getJugadores().add(nuevoJugador);
		listaEquipos.set(idSelecionado, equipoSelecionado);
		sesion.setAttribute("lista", listaEquipos);
		response.sendRedirect("equipos?id=" + idSelecionado);
	}

}