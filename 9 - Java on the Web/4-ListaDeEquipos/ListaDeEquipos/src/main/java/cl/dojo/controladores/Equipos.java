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

@WebServlet("/equipos")
public class Equipos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		if(request.getParameter("id") == null) {
			request.getRequestDispatcher("/WEB-INF/vistas/nuevoEquipo.jsp").forward(request, response);
		} else {
			int idSelecionado = Integer.parseInt(request.getParameter("id"));
			System.out.println("Información del equipo de (id): " + idSelecionado);
			@SuppressWarnings("unchecked")
			ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
			Equipo equipoSelecionado = listaEquipos.get(idSelecionado);
			System.out.println(equipoSelecionado);
			System.out.println("---------------------------------------------");
			ArrayList<Jugador> jugadoresEquipo = equipoSelecionado.getJugadores();
			request.setAttribute("jugadoresEquipo", jugadoresEquipo);
			request.setAttribute("equipoSelecionado", equipoSelecionado);
			request.setAttribute("idSelecionado", idSelecionado);
			request.getRequestDispatcher("/WEB-INF/vistas/infoEquipo.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		Equipo nuevoEquipo = new Equipo(request.getParameter("nombreEquipo"));
		System.out.println("Nuevo equipo creado: " + nuevoEquipo.getNombreEquipo());
		listaEquipos.add(nuevoEquipo);
		System.out.println("Lista de equipos: " + listaEquipos.toString());
		System.out.println("---------------------------------------------");
		sesion.setAttribute("lista", listaEquipos);
		response.sendRedirect("/ListaDeEquipos/");
	}

}