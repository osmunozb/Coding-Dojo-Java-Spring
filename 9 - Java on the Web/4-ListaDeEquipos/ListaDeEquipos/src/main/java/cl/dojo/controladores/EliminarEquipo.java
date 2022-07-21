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

@WebServlet("/eliminarEquipo")
public class EliminarEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Equipo> listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		int idEquipo = Integer.parseInt(request.getParameter("id"));
		System.out.println("Eliminar equipo de ID: " + idEquipo);
		System.out.println("Equipo a eliminar: " + listaEquipos.get(idEquipo));
		
		listaEquipos.remove(idEquipo);
		System.out.println("Equipo selecionado eliminado");
		System.out.println("---------------------------------------------");
		sesion.setAttribute("lista", listaEquipos);
		response.sendRedirect("/ListaDeEquipos/");
	}

}