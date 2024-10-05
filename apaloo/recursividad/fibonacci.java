package Recursividad;

public class fibonacci {
    public static void fibo(int n){
        if(n==0){
            return;
        } 
        int a = 0, b = 1,sum = 0;
        a = b; 
        b = sum;
        sum = a+b ; 
        System.out.println(sum);
        fibo(n-1);
    }
    public static void main(String[] args) {
        fibo(10);
    }
}
