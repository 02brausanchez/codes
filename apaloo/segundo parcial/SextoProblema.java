package Apaloo;

public class SextoProblema {

	private static double encontrarRC(double num, double min, double max) {
	double medio = (min + max) / 2.0;
				
	// Caso base
	if (Math.abs(medio * medio - num) < num * 0.01) {
		return medio;
	}
				
	if (medio * medio > num) {
		return encontrarRC(num, min, medio); // Recorre en la mitad a la izquierda
	}
				
		return encontrarRC(num, medio, max); // Recorre en la mitad a la derecha
	}
			
	public static double encontrarRC(double num) {
		return encontrarRC(num, 0.0, num);
	}
			
	public static void main(String[] args) {
		// Definir un valor para encontrar su raíz cuadrada
		double numero = 9.0;
		System.out.print("La raíz cuadrada de " + numero + " es: ");
		System.out.println(encontrarRC(numero));
	}
}
