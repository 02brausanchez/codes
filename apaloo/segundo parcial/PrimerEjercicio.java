package Apaloo;
/*
 * Casos a cumplir: 
 * 20, 30, 15, 10, 10, 15, 30, 20 //verdadero 
 * En el siguiente caso deberá de regresar falso
 * 20, 30, 15, 10, 10, 12, 20, 30
 * 2 3 4 5 5 4 3 2 //verdadero 
 * 1000,100,10,1,1,10,100,9 // falso 
 * 2,1,3 // falso
 * 1,2,1 // verdero
 * 
 */
public class PrimerEjercicio {
	private static boolean capicua(int [] datos, int min, int max) {
		//caso base
		if(min > max) {
			return true;
		}
		if(datos[min] != datos[max]) {
			return false;
		}	
						
		return capicua(datos,min+1,max-1);
	}
	
	public static boolean capicua(int [] datos) {
		return capicua(datos,0,datos.length-1);
	}

	public static void main(String[] args) {
		int [] datos = {1,2,3,4,6,4,3,2,1}; //true
		//int [] datos = {20, 30, 15, 10, 10, 15, 30, 20};//true
		//int [] datos = {20, 30, 15, 10, 10, 12, 20, 30};//false
		System.out.println(capicua(datos));

	}
}
