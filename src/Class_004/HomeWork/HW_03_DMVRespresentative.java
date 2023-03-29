package Class_004.HomeWork;

import java.util.Scanner;

public class HW_03_DMVRespresentative {
    public static void main(String[] args) {
        Scanner inputter=new Scanner(System.in);
        System.out.println("Dear Customer, Please enter your age");
        int age=inputter.nextInt();

        if(age>=18){
            System.out.println("Driver license is issued");
        } else {
            System.out.println("Please get a learner's permit. Drive license is not issued");
        }
    }
}
