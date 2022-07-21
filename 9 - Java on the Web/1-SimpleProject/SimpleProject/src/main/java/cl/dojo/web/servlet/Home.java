package cl.dojo.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre;
		String apellido;
		String lenguaje;
		String ciudad;
		
		PrintWriter pw = response.getWriter();
		

		if (request.getParameter("nombre") != null) {
			nombre = request.getParameter("nombre");
		}else {
			nombre = "Unknown";
		}

		
		if (request.getParameter("apellido") != null) {
			apellido = request.getParameter("apellido");
		}else {
			apellido = "Unknown";
		}
		
				
		if (request.getParameter("lenguaje") != null) {
			lenguaje = request.getParameter("lenguaje");
		}else {
			lenguaje = "Unknown";
		}
		
		if (request.getParameter("ciudad") != null) {
			ciudad = request.getParameter("ciudad");
		}else {
			ciudad = "Unknown";
		}
		
		
		pw.println("<html>");
		pw.println("<Body>");
		
		pw.println("<h1 style='font-size: 50;'>");
		pw.println("Bienvenido, "+ nombre + " " + apellido);
		pw.println("</h1>");
		
		pw.println("Tu lenguaje favorito es: " + lenguaje);
		pw.println("<br>");
		pw.println("<br>");
		pw.println("Tu ciudad es: " + ciudad );
		
		pw.println("<Body>");
		pw.println("<html>");
		
		
		
//		http://localhost:8080/SimpleProject/Home?nombre=Manuel&apellido=Osorio&lenguaje=Java&ciudad=Talcahuano
		


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
