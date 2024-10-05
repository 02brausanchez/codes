package Recursividad;

import java.util.Scanner;

public class EjemploUno {
    static Scanner sc = new Scanner(System.in); 
    /*
    public static void messageMethod(int reps){
        if(reps > 0){
            System.out.println("Message " + reps);
            messageMethod(reps-1);
        }
    }
    */

    /*
    public static void sumOfNumbers(int numbers){
        int sum = 0; 
        int n = 0; 
        if(numbers > 0){
            System.out.println("Enter number: ");
            n = sc.nextInt(); 
            sumOfNumbers(numbers-1);
            n--; 
        }
        //n = sc.nextInt(); 
        sumOfNumbers(sum + n); 
    }
    */
    /*
    public static int sumNumbers(int add){
        if(add != 0){
            System.out.println("Enter number: ");
            int num = sc.nextInt(); 
            return (num + sumNumbers(add-1)); 
        }else{
            System.out.println("--------");
            return add; 
        }
    }
    */
    public static void breakIntoWords(String s){
        //caso base 
        int space = s.indexOf(' '); 
        if(space == -1){
            System.out.println(s);
        }else{
            breakIntoWords(s.substring(0,space));
            breakIntoWords(s.substring(space + 1));
        }
    }

    public static void main(String[] args) {
        /*
        messageMethod(4);
        System.out.println("How many numbers do you want to add? ");
        int add = sc.nextInt(); 
        int sum = sumNumbers(add); 
        System.out.println("Sum is: " + sum);
        */
        System.out.print("Enter a phrase >> ");
        String phrase;
        phrase = sc.nextLine();  
        breakIntoWords(phrase); 

        
    }
}
