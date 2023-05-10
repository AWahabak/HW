package Class_019.HomeWork;
/* HW04
    Create 1 class with a private method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe result.
 */
public class PrivateOverloaded {
    private static void avgFinder(int num1, int num2, double num3){
        double result = (num1+num2+num3)/3;
        System.out.println("The average of two numbers and a double number is "+result);
    }
    private static void avgFinder(int num1, double num2, int num3){
        double result = (num1+num2+num3)/3;
        System.out.println("The average of a number, a double number and another number is "+result);
    }
    private static void avgFinder(double num1, int num2, int num3){
        double result = (num1+num2+num3)/3;
        System.out.println("The average of a double number and two numbers is "+result);
    }

    public static void main(String [] args){
        PrivateOverloaded.avgFinder(5,7,10.5);
        PrivateOverloaded.avgFinder(5,10.5,30);
        PrivateOverloaded.avgFinder(5.7,10,20);
    }
}

