package Class_012.HomeWork;

import java.util.Scanner;

public class HW03_NameConstruct {
    public static void main(String[] args) {
        /*
        Write a program
            that reads two people's first names
            and if they are expecting boy or girl?
                Based on the input suggests a name for a baby:
                    Example Output:
                    Mom’s first name? Mary
                    Dad’s first name? Daniel
                    Boy or Girl? boy
                    Suggested baby name: DANRY

                    Example Output:
                    Mom’s first name? Mary
                    Dad’s first name? Daniel
                    Boy or Girl? girl
                    Suggested baby name: MAIEL
         */

        Scanner userInput=new Scanner(System.in);
        System.out.print("Mom's first name? ");
        String fNameMom=userInput.next();
        System.out.print("Dad's first name? ");
        String fNameDad=userInput.next();
        System.out.print("Boy or Girl? ");
        String babyGender=userInput.next().toLowerCase();

        String babyName=new String();

        if(babyGender.equals("boy")){
            babyName=fNameDad.substring(0,3)+fNameMom.substring(fNameMom.length()-2);
            System.out.println("Suggested baby name: "+babyName);

        } else if (babyGender.equals("girl")){
            babyName=fNameMom.substring(0,2)+fNameDad.substring(fNameDad.length()-3);
            System.out.println("Suggested baby name: "+babyName);

        } else {
            System.out.println("The gender is not identified.");
        }

    }
}
