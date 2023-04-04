package Class_006.HomeWork;

import java.util.Scanner;

public class HW2_Number {
    public static void main(String[] args) {
        /*
        Ask user to enter a number
            and then define if number is small, medium or large
                Small number is value between 1 and 10
                Medium number is value between 11 and 100
                Large number is value between 101 and 1000`
         */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=userInput.nextInt();
        //Test scanner
        //System.out.println(number);

            if(number>0 && number<=10){
                System.out.println(number+" is a small number");

            }else if(number>=11 && number<=100){
                System.out.println(number+" is a medium number");

            }else if (number>=101 && number<=1000){
                System.out.println(number+" is a large number");

            } else {
                System.out.println("Please enter from 1 to 1000");
            }
    }
}
