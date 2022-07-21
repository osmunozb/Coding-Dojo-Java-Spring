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

@WebServlet("/eliminarJugador")
public class EliminarJugador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		int idEquipo = Integer.parseInt(request.getParameter("id"));
		int jugadorId = Integer.parseInt(request.getParameter("jugadorId"));
		System.out.println("Equipo que va a eliminar un jugador: " + listaEquipos.get(idEquipo));
		Equipo equipoSelecionado = listaEquipos.get(idEquipo);
		ArrayList<Jugador> jugadoresEquipo = equipoSelecionado.getJugadores();
		System.out.println("Jugador que va a ser eliminado: " + jugadoresEquipo.get(jugadorId));
		jugadoresEquipo.remove(jugadorId);
		listaEquipos.set(idEquipo, equipoSelecionado);
		System.out.println("Jugador eliminado");
		System.out.println("---------------------------------------------");
		sesion.setAttribute("lista", listaEquipos);
		response.sendRedirect("equipos?id="+idEquipo);
	}


}