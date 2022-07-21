package cl.dojo.librerias;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Mapa {
	
	public void canciones() {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Molinos de viento", "Si acaso tú no ves, más allá de tu nariz...");
        trackList.put("El atrapasueños", "Dichoso es el que ve, que cielo y horizonte...");
        trackList.put("Fiesta pagana", "Cuando despiertes un día y sientas que no puedes más...");
        trackList.put("La posada de los muertos", "Alza tu cerveza, brinda por la libertad...");
        
        System.out.println("Nombres de las pistas y las nombres en un formato Track: Lyrics");
        System.out.println("---------------------Grupo 'Mägo de Oz'---------------------\n");
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.print(key+":   ");
            System.out.println(trackList.get(key));    
        }
        
        System.out.println("--------------------------------------------------------------");
                   
        try (Scanner scn = new Scanner(System.in)) {
			String nombre;
			
			do {
				System.out.println("Ingrese el nombre de una cancion para ver su letra");
				nombre = scn.nextLine();
				if (trackList.get(nombre)!=null) {
					System.out.print(nombre+":    ");
			    	System.out.println(trackList.get(nombre));    
			    }else {
			    	System.out.println("Nombre de cancion no existe o se ingreso de manera incorrecta, vuelva a intentarlo \n");
			    }
			} while (trackList.get(nombre)==null);
		}
        System.out.println("\n---------------------Final del codigo---------------------\n");
        
    }
}
