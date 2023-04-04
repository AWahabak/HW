package Class_006.HomeWork;

import java.util.Scanner;

public class HW7_Grade {
    public static void main(String[] args) {
        /*
        Allow user to enter grade (A, B, or C etc...)
            and then provide explanation:
                A-Excellent,
                B-Good,
                C-Average,
                D-Bad,
                any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
         */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter grade");
        char grade=userInput.next().charAt(0);

        System.out.println("Explanation of grades");
        System.out.println("____________________________________________________________________");
        System.out.println("If the grade is A then it is excellent.");
        System.out.println("If the grade is B then it is good.");
        System.out.println("If the grade is C then it is average.");
        System.out.println("If the grade is D then it is bad.");
        System.out.println("If the grade is other than A, B, C, and D then it is not acceptable.");
        System.out.println("____________________________________________________________________");

        switch (grade){
            case 'A', 'a':
                System.out.println("Your grade entered is "+grade+" and it stands for A-Excellent.");
                break;
            case 'B', 'b':
                System.out.println("Your grade entered is "+grade+" and it stands for B-Good.");
                break;
            case 'C', 'c':
                System.out.println("Your grade entered is "+grade+" and it stands for C-Average.");
                break;
            case 'D', 'd':
                System.out.println("Your grade entered is "+grade+" and it stands for D-Bad.");
                break;
            default:
                System.out.println("Your grade is not acceptable.");
        }
        System.out.println("____________________________________________________________________");
    }
}
