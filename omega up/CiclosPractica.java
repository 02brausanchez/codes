package omegaup;
import java.util.Scanner;

public class CiclosPractica {
        public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int n, a, b;

    n = teclado.nextInt();
    a = teclado.nextInt();
    b = teclado.nextInt();
    int variable = n;

    while(variable < 1000){
        if(variable % 2 == 0){
            for(int i = 1; i <= a; ++i){
                variable = variable + i;
            }
        }else{
            for(int i = 1; i <= b ; ++i){
                variable = variable + i;
            }
        }
    }
        System.out.println(variable);
        teclado.close();
    }
}
