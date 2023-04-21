package GroupTasks001;

import java.util.Scanner;

public class CT06_AnyNumberPrimeIdentifier {
    public static void main(String[] args) {

        /*
        Write a java program to check whether a given
        number is prime or not?
         */

        // A prime number is a number that can only be divided by itself and 1 without remainders.
        // A common definition of a prime number is that it can only be divided by 1 and the number itself

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number above 1 to check if it is prime or not");

        int num=userInput.nextInt();
        int countFactor=0;


        if(num < 2){
            System.out.println(num+" is not a prime number as it is less than 2");
        } else if(num>=2){
            System.out.println(+num+" is dividable by following factors:");
            for (int i=1; i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                    countFactor++;
                }

            }
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("The total frequency of factors are "+countFactor);
        System.out.println("-----------------------------------------------------------------------------");

        if (countFactor==2){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is not a prime number");
        }
    }
}
