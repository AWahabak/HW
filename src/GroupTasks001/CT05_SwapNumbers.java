package GroupTasks001;

public class CT05_SwapNumbers {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

        int num1=34;
        int num2=45;

        System.out.println(num1+" is assigned to num1 originally");  //34
        System.out.println(num2+" is assigned to num2 originally");  //45

        System.out.println("Swapping with '+' & '-' operators........");

        num1=num1+num2; // equals to 34+45=79
        num2=num1-num2; // equals to 79-45=34
        num1=num1-num2; // equals to 79-34=45

        System.out.println("After swapping num1 is now "+num1); //45
        System.out.println("After swapping num2 is now "+num2); //34

        System.out.println("Swapping back with '*' and '/' operator........");

        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;

        System.out.println("After swapping num1 is now "+num1); //34
        System.out.println("After swapping num2 is now "+num2); //45



    }
}
