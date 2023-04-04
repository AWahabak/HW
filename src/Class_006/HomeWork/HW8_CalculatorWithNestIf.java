package Class_006.HomeWork;

import java.util.Scanner;

public class HW8_CalculatorWithNestIf {
    public static void main(String[] args) {
        /*
        Using scanner class create calculator.
            Allow user to enter 2 numbers and operator(+,-,*,/).
                Based on operator provide the result to user.
        Please complete this assignment in 2 ways: using if statement and switch case.
         */

        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        float num1=userInput.nextFloat();
        System.out.println("Please enter the arithmetic operator for calculation");
        char operator=userInput.next().charAt(0);
        System.out.println("Please enter the 2nd number");
        float num2=userInput.nextFloat();
        float result;

        //Calculator with Nestedif statement
        if(operator=='+'){
            result=num1+num2;
            System.out.println(result+" is the result of calcution");
        } else if (operator=='-'){
            result=num1-num2;
            System.out.println(result+" is the result of calcution");
        } else if (operator=='*'){
            result=num1*num2;
            System.out.println(result+" is the result of calcution");
        } else if (operator=='/'){
            result=num1/num2;
            System.out.println(result+" is the result of calcution");
        } else if (operator=='%'){
            result=num1%num2;
            System.out.println(result+" is the result of calcution");
        } else {
            System.out.println("The operator is not recoganized.");
        }
    }
}
