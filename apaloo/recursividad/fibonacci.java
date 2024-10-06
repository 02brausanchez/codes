package Recursividad;

public class fibonacci {
    public static void fibo(int a, int b, int n){
     //caso base 
     if(n == 0){
        return; 
    }
    int sum = a+b; 
    System.out.println(sum);
    fibo(b, sum, n-1);
    }
    
    public static void main(String[] args) {
     int a = 0, b = 1;
     System.out.println(a);
     System.out.println(b);
     fibo(a,b,5);  
    }
}
