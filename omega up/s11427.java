package omegaup;
import java.util.Scanner;

public class s11427 {

    public static int checkCharacter(String word) {
        int length = word.length();
        int count_character = 0;

        for (int i = 0; i < length; i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(length - 1 - i))) {
                count_character++;
            }
        }
        return count_character;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String word = sc.nextLine(); 
        int printResult = checkCharacter(word); 
        System.out.println(printResult);
    }  
}



