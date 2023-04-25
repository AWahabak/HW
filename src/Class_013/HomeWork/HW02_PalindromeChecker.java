package Class_013.HomeWork;

import java.util.Scanner;

public class HW02_PalindromeChecker {
    public static void main(String[] args) {

        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */

        /*
        A string is said to be palindrome if it remains the same on reading from both ends.
        It means that when you reverse a given string, it should be the same as the original string.
        such as:
        Anna, civic, kayak, level, madam, mom, noon, racecar, radar, redder, refer, repaper, rotator, rotor, sagas, solos, stats, tenet, wow
         */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a word to check if palindrome or not");
        String str1=userInput.next();
        StringBuilder strB1=new StringBuilder(str1).reverse();

        if(str1.equals(strB1.toString())){
            System.out.println("True, the word is palindrome.");
        } else {
            System.out.println("False, the word is not palindrome");
        }

    }
}
