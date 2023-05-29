package GroupTasks002;
import java.util.Scanner;
/*
1. Reverse a String:
Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */
public class GW01StringReverser {
    public static void main(String[] args) {
        //to input the reversible word(s)
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please provide the word(s) to reverse");
        String input = userInput.nextLine();

        //to display the reverse form by using the function built with String
        Functions rev = new Functions();
        String reverse = rev.reverseFunction(input);
        System.out.println(reverse);
    }
}

