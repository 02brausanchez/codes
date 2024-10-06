package omegaup;
import java.util.*;

public class Palabra_Corta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Palabra;
        int num_palabras;

        System.out.println("Ingresa el numero de palabras");
        num_palabras = teclado.nextInt();
        teclado.nextLine();

        String palabra_corta = "";
        int longitud_corta = Integer.MAX_VALUE;

        for(int i = 0; i < num_palabras; i++){
            System.out.println("Ingresa tu palabra: ");
            Palabra = teclado.nextLine().trim();
            if(Palabra.length() < longitud_corta){
                palabra_corta = Palabra;
                longitud_corta = Palabra.length();
            }
        }
        System.out.println("La palabra más corta es: " + palabra_corta);
        System.out.println("Tiene " + longitud_corta + " caracteres");

        if(longitud_corta % 2 == 0){
            System.out.println("La longitud de la palabra es par");
        }else{
            System.out.println("La longitud de la palabra es impar");
        }
    }
}
