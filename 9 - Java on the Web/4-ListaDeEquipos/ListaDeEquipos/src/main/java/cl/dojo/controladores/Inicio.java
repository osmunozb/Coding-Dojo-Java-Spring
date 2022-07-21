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

@WebServlet("/")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		ArrayList<Equipo> listaEquipos;
		if(sesion.getAttribute("lista") != null) {
			listaEquipos = (ArrayList<Equipo>) sesion.getAttribute("lista");
		} else {
			listaEquipos = new ArrayList<Equipo>();
			sesion.setAttribute("lista", listaEquipos);
		}	
		request.getRequestDispatcher("/WEB-INF/vistas/index.jsp").forward(request, response);
	}


}