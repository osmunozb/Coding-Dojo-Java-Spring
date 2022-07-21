package cl.dojo.web.modelos;

public class Verificar {
	
	private int random;
	private int adivinar;
	private static int contador;
		
	public Verificar(int random, int adivinar) {
		this.random = random;
		this.adivinar = adivinar;
		contador++;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getAdivinar() {
		return adivinar;
	}

	public void setAdivinar(int adivinar) {
		this.adivinar = adivinar;
	}
	
	
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Verificar.contador = contador;
	}

	public String verificarAdivinar() {
		String estado ="";
		
		if(this.adivinar > this.random) {
			estado = "alto";
		}else if (this.adivinar < this.random) {
			estado = "bajo";
		}else {
			estado = "encontrado";
		}
		
		
		return estado;
		
	}
	
	

}