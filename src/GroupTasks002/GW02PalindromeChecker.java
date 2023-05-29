package GroupTasks002;

import java.util.Scanner;

/*
2. Check if a String is Palindrome:
Determine whether a given string is a palindrome,
which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class GW02PalindromeChecker {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please provide the string for palindrome check");
        String input = userInput.nextLine().toLowerCase();

        Functions str = new Functions();
        str.palindromeChecker(input);
    }
}
