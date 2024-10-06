package omegaup;
import java.util.Scanner;

public class Conteo_Basico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        for (int cont = n1; cont <= n2; cont++) {
            System.out.println(cont);
        }
        teclado.close();
    }
}
