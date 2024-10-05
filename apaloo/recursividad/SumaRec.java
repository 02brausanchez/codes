package Recursividad;

public class SumaRec {
    private static int contador = 1;

    public static int sumaRecursiva(int n){
        if(n <= 9){
            return n; 
        }else{
            return sumaRecursiva(n/10) + n % 10; 
        }
    }

    public static String numDigitos(int n){
        String valores = ",";
        //int count = 0; 

        if(n <= 9){
            return String.valueOf(n);
        }else{
            contador++; 
            return numDigitos(n/10) + valores + (n % 10);        
        }
    }

    public static void print(int num){ 
        if(num == 0){
            return; 
        }else{
            print(num-1);
            System.out.print(num + " ");
        }
    }
    
    public static int sumNaturals(int num){
        if(num == 0){
            return num; 
        }else{
            return sumNaturals(num-1) + num % 10;
            //return sumNaturals(num/10) + num % 10; 
        }
    }

    public static void main(String[] args) {
        int n = 10; // 2 + 5 + 9 = 16
        //int num = 4;
        System.out.println("El " + n );
        System.out.println(numDigitos(n) + " tiene " + contador + " digitos ");
        //System.out.println(sumaRecursiva(n));
        //print(num);
        //System.out.println("= "+sumNaturals(num));
    }
}
