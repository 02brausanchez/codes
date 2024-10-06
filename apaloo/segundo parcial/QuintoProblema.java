package Apaloo;

public class QuintoProblema {
	public static String copia(String texto) {
		if(texto.length() == 0 ) {//caso base 
			return ""; 
		}
		return texto.charAt(0)+ copia(texto.substring(1)); 
	}
	
	public static void main(String[] args) {
		System.out.println(copia("perro cafe"));
		System.out.println(copia("La casa blanca"));
		 
	}
}
