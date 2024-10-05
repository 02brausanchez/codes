package Recursividad;

public class S326 {
    static boolean isPowerThree(int n){
        //caso base  
        if(n <= -1){return false;}
        else{
            Math.pow(n, 3); 
            isPowerThree(n-1); 
            return true; 
        }
    }

    public static void main(String[] args) {
        int n = 0; 
        System.out.println(isPowerThree(n));
    }
    
}
