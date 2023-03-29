package Class_004.HomeWork;

import java.util.Scanner;

public class HW_02_LoanSpecialist {
    public static void main(String[] args) {
        Scanner inputter=new Scanner(System.in);
        System.out.println("Please enter the amount of required loan");
        int loan=inputter.nextInt();

        if(loan<=200000){
            System.out.println("You are eligible to loan");
        } else {
            System.out.println("We are sorry, your loan request is rejected");
        }
    }

}

