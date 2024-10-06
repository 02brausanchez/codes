package omegaup;
import java.util.Scanner;

public class TableroAjedrez {
       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila, columna = 0;
        char letra;
        letra = teclado.next().charAt(0);
        fila = teclado.nextInt();
        switch (letra) {
            case 'a':
                columna = 1;
                break;
            case 'b':
                columna = 2;
                break;
            case 'c':
                columna = 3;
                break;
            case 'd':
                columna = 4;
                break;
            case 'e':
                columna = 5;
                break;
            case 'f':
                columna = 6;
                break;
            case 'g':
                columna = 7;
                break;
            case 'h':
                columna = 8;
                break;
        }
        if (columna % 2 == 1) {
            if (fila % 2 == 1) {
                System.out.println("Negro");
            } else {
                System.out.println("Blanco");
            }
        } else {
            if (fila % 2 == 1) {
                System.out.println("Blanco");
            } else {
                System.out.println("Negro");
            }
        }
        teclado.close();
    }
}
