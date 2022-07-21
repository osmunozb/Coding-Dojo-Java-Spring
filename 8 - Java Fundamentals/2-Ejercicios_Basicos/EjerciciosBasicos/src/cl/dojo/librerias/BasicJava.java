package cl.dojo.librerias;

import java.util.ArrayList;

public class BasicJava {

//	Actividad 1 (Imprimir 1 - 255)
	public void actividad1() {
		System.out.println("Actividad 1 (Imprimir 1 - 255): ");
		for(int i=1; i<=255; i++) {
			System.out.println(i);
		}
		
	}
	
	
//	Actividad 2 (Imprimir los Numeros Impares Entre 1 - 255)
	public void actividad2() {
		System.out.println("Actividad 2 (Imprimir los Numeros Impares Entre 1 - 255): ");
		for(int i=1; i<=255; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
		
	}
	
	
//	Actividad 3 (Imprimir la Suma desde el 0 hasta el 255)
	public void actividad3() {
		System.out.println("Actividad 3 (Imprimir la Suma desde el 0 hasta el 255): ");
		int suma = 0;
		for(int i=0; i<=255; i++) {
			suma = suma +i;
			System.out.printf("Nuevo numero: %d Suma %d \n", i,suma);
		}	
	}
	
	
//	Actividad 4 (Recorrer un Arreglo)
	public void actividad4() {
		System.out.println("Actividad 4 (Recorrer un Arreglo X, digamos X=[1,3,5,7,9,13])");
		int X [] = {1,3,5,7,9,13};
		for(int i=0; i<X.length; i++) {
			System.out.printf("Posicion: %d, Elemento: %d \n", i,X[i]);
		}
	}
	
	
//	Actividad 5 (Encontrar el Maximo)
	public void actividad5() {
		System.out.println("Actividad 5 (Encontrar el Maximo, digamos arr=[-3,-5,-7])");
		int arr []= {-3,-5,-7};
		int max = arr[0];		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("El numero maximo del array es: "+ max);
	}
	
	
//	Actividad 6 (Obtener el Promedio)
	public void actividad6() {
		System.out.println("Actividad 6 (Obtener el Promedio, digamos arr=[2,10,3])");
		float arr []= {2,10,3};
		float suma = 0;
		for(int i=0; i<arr.length; i++) {
			suma = suma + arr[i];
		}	
		float promedio = suma/arr.length;
		System.out.println("El promedio del array es: "+promedio);
	}
	
	
//	Actividad 7 (Arreglo con Numeros Impares Entre 1 - 255)
	public void actividad7() {
		ArrayList<Integer> Y = new ArrayList<Integer>();
		for(int i=1; i<=255; i++) {
			if(i%2 !=0) {
				Y.add(i);
			}
		}
		System.out.println("Actividad 7 (Arreglo con Numeros Impares Entre 1 - 255), Y= "+ Y);
	}
	
	
//	Actividad 8 (Mayor que Y, digamos arr=[1,3,5,7] y Y=3)
	public void actividad8() {
		System.out.println("Actividad 8 (Mayor que Y, digamos arr=[1,3,5,7] y Y=3)");
		int [] arr= {1,3,5,7};
		int Y = 3;
		int contador = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>Y) {
				contador = contador + 1;
			}
		}
		System.out.printf("La cantidad de numeros mayores a Y = %d en el array son: %d \n", Y,contador);
	}
	
	
//	Actividad 9 (Valores al Cuadrado, digamos x = [1,5,10,-2])
	public void actividad9() {
		System.out.println("Actividad 9 (Valores al Cuadrado, digamos x = [1,5,10,-2])");
		int [] x= {1,5,10,-2};
		
		for (int i=0; i<x.length; i++) {
			x[i]= x[i]*x[i];
			System.out.println(x[i]);
		}

	}
	
	
//	Actividad 10 (Eliminar Numeros Negativos, digamos x = [1,5,10,-2])
	public void actividad10() {
		System.out.println("Actividad 10 (Eliminar Numeros Negativos, digamos x = [1,5,10,-2])");
		int [] x= {1,5,10,-2};
		
		for (int i=0; i<x.length; i++) {
			if(x[i]<0) {
				x[i]=0;
			}
			System.out.println(x[i]);
		}
	}
	
	
//	Actividad 11 (Minimo, Maximo y Promedio, digamos x = [1,5,10,-2])
	public void actividad11() {
		System.out.println("Actividad 11 (Minimo, Maximo y Promedio, digamos x = [1,5,10,-2])");
		float [] x= {1,5,10,-2};
		float Max = x[0];
		float Min = x[0];
		float suma = 0;;
		for(int i=0; i<x.length; i++) {
			if (x[i]>Max) {
				Max = x[i];
			}
			if (x[i]<Min) {
				Min = x[i];
			}
			suma = suma + x[i];
		}
		float Prom = suma/x.length;
		float [] arr={Max, Min, Prom};
		System.out.println("Arreglo arr = [Max, Min, Prom]");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" / ");
		}
	}
	
	
//	Actividad 12 (Cambiando los Valores del Arreglo, digamos x = [1,5,10,7,-2])
	public void actividad12() {
		System.out.println("\nActividad 12 (Cambiando los Valores del Arreglo, digamos x = [1,5,10,7,-2])");
		int [] x= {1,5,10,7,-2};
		
		for (int i=0; i<x.length; i++) {
			
			if(i<x.length-1) {
				
				x[i]=x[i+1];
			}else {
				x[i]=0;
			}
			System.out.println(x[i]);
		}
		
	}
	
	

	
	
}
