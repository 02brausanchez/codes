package Apaloo;

public class CuartoProblema {
	private static int ultimo(int [] datos, int limiteInferior, int limiteSuperior) {
		//caso base 
		if(limiteInferior == limiteSuperior ) {
			return datos[limiteInferior]; 
		}
		return ultimo(datos,limiteInferior+1,limiteSuperior); 
	}
	
	public static int ultimo(int [] datos) {
		return ultimo(datos,0,datos.length-1); 
	}
		
	public static void main(String[] args) {
		//creamos los arreglos 
		int [] a = {1,2,3,4,5,6,7,8,9,10,20,15};
		int [] b = {10, 1,2,3,4,5,6,7,8,9,10,20};
		System.out.println(ultimo(a));//15
		System.out.println(ultimo(b));//20
		
	}
}
