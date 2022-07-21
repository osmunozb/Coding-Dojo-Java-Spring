package cl.dojo.libreria;

import java.util.Scanner;

public class Pitagoras {
	
	public void calcularHipotenusa() {
		int catetoA, catetoB;
		System.out.println("Teorema de pitagoras iniciado");
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Ingrese el cateto A");
			catetoA = scn.nextInt();
			System.out.println("Ingrese el cateto B");
			catetoB = scn.nextInt();
		}
		double hipo = Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		
		System.out.printf("El valor de la hipotenusa es: %.2f", hipo);

	}
	
	
	
	
	
	
	
	
	
	

}
