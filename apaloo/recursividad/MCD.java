package Recursividad;

public class MCD {

    public static int mcd(int m, int n){
        if(n <= m && m % n == 0){
            return n; 
        }else if(m < n){
            return mcd(n, m); 
        }else{
            return mcd(n, m % n);
        }
    }
    public static void main(String[] args) {
        int m = 124;
        int n = 10;
        System.out.println("El mcd es: " + mcd(m, n));
    }
    
}
