package Apaloo;

public class EjercicioDos {
	private static boolean iguales(int [] a, int [] b, int limiteInferior , int limiteSuperior) {
		//Definimos el caso base
		if(limiteInferior > limiteSuperior) {
			return true; 
		}
		//Si son distintos valores
		if(a[limiteInferior] != b[limiteInferior]) {
			return false;
		}
		
		return iguales(a,b,limiteInferior+1,limiteSuperior);
	}
	
	public static boolean iguales(int [] a, int [] b) {
		if(a.length != b.length) {//Si tienen diferentes longitudes
			return false; 
		}
		return iguales(a,b,0,a.length-1);
	}
	
	
	public static void main(String[] args) {
		//Creamos los arreglos a y b 
		int [] a = {1,2,3,4,5,6,7,8,9,10,20,15};
		int [] b = {10,1,2,3,4,5,6,7,8,9,10,20,15};
		
		System.out.println(iguales(a,a));
		System.out.println(iguales(b,b));
		System.out.println(iguales(a,b));
		
	}
}
