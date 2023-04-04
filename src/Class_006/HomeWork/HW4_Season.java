package Class_006.HomeWork;

import java.util.Scanner;

public class HW4_Season {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
            Based on the month define the season.
                Example:
                    if user is born in March, April, May → season =”Spring”
                    if user is born in June, July, August →
                    season =”Summer”  etc …
            At the end of the program we should see 1 output as “You were born season is __”.
         */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter yor birth month");
        int month=userInput.nextInt();

            if(month>=3 && month<=5){
                System.out.println("You are born season is spring");

            } else if (month>=6 && month<=8){
                System.out.println("You are born season is summer");

            } else if (month>=9 && month<=11) {
                System.out.println("You are born season is fall");

            } else if (month==12 || month==1 || month==2){
                System.out.println("You are born season is winter");
            }

    }
}
