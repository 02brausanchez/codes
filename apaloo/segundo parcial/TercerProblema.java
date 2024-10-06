package Apaloo;
public class TercerProblema {
	private static boolean busca(int [] datos,int limiteInferior, int limiteSuperior,int x) {
		if(limiteInferior > limiteSuperior) {//Caso base 
			return false; 
		}
		if(datos[limiteInferior] == x) {
			return true; 
		}
		return busca(datos, limiteInferior+1, limiteSuperior,x);
	}
	
	public static boolean busca(int [] datos, int x) {
		return busca(datos,0,datos.length-1,x);
	}
	
	public static void main(String[] args) {
		int [] a = {5,6, 1, 2, 9, 6, 23, 15, 5};
		System.out.println(busca(a,0));
		System.out.println(busca(a,9));
		System.out.println(busca(a,17));
		System.out.println(busca(a,5));

	}
}
