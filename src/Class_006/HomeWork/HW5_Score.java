package Class_006.HomeWork;

import java.util.Scanner;

public class HW5_Score {
    public static void main(String[] args) {
        /*
        Write a program that will
            read three inputs of scores (quiz, mid term, and final scores)
            and determine the grade based on the following rules:
                if the average score >=90 → grade=A
                if the average score >= 70 and <90 → grade=B
                if the average score>=50 and <70 → grade=C
                if the average score<50 → grade=F
         */
        Scanner userInput=new Scanner(System.in);
            System.out.println("Please enter your quiz score (from 0 to 100)");
                int scoreQuiz=userInput.nextInt();
            System.out.println("Please enter your mid-term score (from 0 to 100)");
                int scoreMidTerm=userInput.nextInt();
            System.out.println("Please enter your final score (from 0 to 100)");
                int scoreFinal=userInput.nextInt();
                int scoreTotal=scoreQuiz+scoreMidTerm+scoreFinal;
                int scoreAverage=scoreTotal/3;
                //to test both scanner and average score output
                //System.out.println(scoreAverage+ " is the average score");

            //a check to validate your input is required
            //still the user can add two more 100 and one less 100 for exmaple; for which each input needs to validated
            if(scoreTotal>300){
                System.out.println("Wrong values are enter");
                System.out.println("You total is "+scoreTotal+" which should not be more than 300");
                System.out.println("The result will not be accurate");

            } else {
                System.out.println("Your total score is "+scoreTotal);
            }

            //Grading blocks
            if(scoreAverage>=90 && scoreAverage<=100){
                System.out.println("You have achieved Grade A");

            } else if(scoreAverage>=70 && scoreAverage<90){
                System.out.println("You have achieved Grade B");

            } else if(scoreAverage>=50 && scoreAverage<70){
                System.out.println("You have achieved Grade C");

            } else if(scoreAverage<50){
                System.out.println("You have achieved Grade F");

            } else {
                System.out.println("You have probably enter the wrong value");
                System.out.println("Please enter from 0 to 100 only in each score");
            }
    }
}
