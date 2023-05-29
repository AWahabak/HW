package GroupTasks002;

import java.util.Arrays;
import java.util.Scanner;

/*
4. Check if Two Strings are Anagrams:
Given two strings, determine if they are anagrams,
meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class GW04AnagramChecker {
    public static void main(String[] args) {
        //user input of two strings for anagram comparison
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first string");
        String input1 = userInput.nextLine().toLowerCase();
        System.out.println("Please provide the Second string");
        String input2 = userInput.nextLine().toLowerCase();

        //to remove spaces if one word equals multiple words but still could be anagram
        //like editor vs redo it = anagram
        input1 = input1.replaceAll(" ", "");
        input2 = input2.replaceAll(" ", "");

        //convert to an array and sort the characters
        char[] input1Array = input1.toCharArray();
        char[] input2Array = input2.toCharArray();
        Arrays.sort(input1Array);
        Arrays.sort(input2Array);

        if(input1.length() == input2.length())
            {boolean result = Arrays.equals(input1Array, input2Array);
            if(result)
                 {System.out.println("They are anagrams.");}
            else {System.out.println("They are not anagram.");}}
        else {System.out.println("They are not anagram.");}
        }
}

/* Sample Anagrams
1. Angered = enraged
2. Apple Macintosh = laptop machines
3. Astronomer = moon starer
4. Brush = shrub
5. Customers = store scum
6. Dictionary = indicatory
7. Dormitory = dirty room
8. Editor = redo it
9. Eleven plus two = twelve plus one
10. Schoolmaster = the classroom
11. milk = klim
 */