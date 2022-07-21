package cl.dojo.web.controladores;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.dojo.web.modelos.Verificar;


@WebServlet("/procesar")
public class Procesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String botonReinicio="<h5><a href=reinicio;  ><button class='btn btn-success' type=button>Jugar otra vez</button></a></h5>";
		
		int random = (int) session.getAttribute("random");
		Verificar verificar = new Verificar(random, Integer.parseInt(request.getParameter("adivinar")));
		System.out.println("Número de la adivinanza");
		System.out.println(random);
		
		
		if (Verificar.getContador() < 3) {

			if (verificar.verificarAdivinar().equals("encontrado")) {
				String texto = random +" es el número!!!!";
				session.setAttribute("reinicio",botonReinicio );
				session.setAttribute("texto", texto);
				session.setAttribute("color", "bg-primary");
				session.setAttribute("contador", Verificar.getContador());
				Verificar.setContador(0);
				session.setAttribute("none", "d-none");
			}else if (verificar.verificarAdivinar().equals("bajo")){
				String texto = "Muy bajo!";
				session.setAttribute("texto", texto);
				session.setAttribute("color", "bg-danger");
				session.setAttribute("contador", Verificar.getContador());
			}else if (verificar.verificarAdivinar().equals("alto")) {
				String texto = "Muy alto!";
				session.setAttribute("texto", texto);
				session.setAttribute("color", "bg-danger");
				session.setAttribute("contador", Verificar.getContador());
			}
			
			
		}else {
			if (verificar.verificarAdivinar().equals("encontrado")) {
				String texto = random +" es el número!!!!";
				session.setAttribute("reinicio",botonReinicio );
				session.setAttribute("texto", texto);
				session.setAttribute("color", "bg-primary");
				session.setAttribute("contador", Verificar.getContador());
				Verificar.setContador(0);
				session.setAttribute("none", "d-none");
			}else {
			String texto = "Perdiste, el número era: " + random ;
			session.setAttribute("reinicio",botonReinicio );
			session.setAttribute("texto", texto);
			session.setAttribute("color", "bg-warning");
			session.setAttribute("contador", Verificar.getContador());
			Verificar.setContador(0);
			session.setAttribute("none", "d-none");}
		}
		
		
	
		
		response.sendRedirect("/JuegoGreatNumber/");
		
		
	}

}

