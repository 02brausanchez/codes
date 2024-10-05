package Recursividad;
import java.util.Arrays;

public class MueveCoordenada {
    public static void mueve(int x, int y,char [] camino, int i){
        if(x == 0 && y == 0){
            System.out.println("Llegue");
            System.out.println(Arrays.toString(camino));
            return;
        }
        //Se hacen todas las posibles permutaciones
        if(x > 0){
            camino[i] = 'x';
            mueve(x-1,y,camino,i+1);
        }
        if(y > 0){
            camino[i] = 'y';
            mueve(x,y-1,camino,i+1);
        }
    }
    public static void suma(int n){
        if(n == 0){
            System.out.println("0+0" );
        }
        suma(0,n,n);
    }
    public static void suma(int x, int y, int n){
        if(x < n+1){
            System.out.println(" x = " + x +", y = "+y);
            suma(x+1,y-1,n);
        }
        //suma(x+1,y,n);
        //suma(x,y+1,n);
    }
    public static void sumaE(int x, int n){
        System.out.println(" x= "+ x + " y= "+(n-x));
        if(x < n){
            sumaE(x+1,n);
        }
        //sumaE(x+1,n);
    }
    public static void main(String[] args) {
        //mueve(3,2,new char[5],0);
        suma(7);
        //sumaE(0,6);

    }
}
