package GroupTasks002;

import java.util.Scanner;

/*
3. Count the Number of Words in a String:
Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation.
For example, the input "Hello, world!" should return 2.
 */
public class GW03WordCounter {
    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please provide the string count the words");
        String input = userInput.nextLine().toLowerCase();

        Functions wordCount = new Functions();
        wordCount.countWords(input);
    }
}
