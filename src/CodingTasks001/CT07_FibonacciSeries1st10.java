package CodingTasks001;

public class CT07_FibonacciSeries1st10 {
    public static void main(String[] args) {

        /*
        Write a Java Program to print the first 10 numbers of
        Fibonacci series.
         */

        //The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1

        int num1=0,num=1,num3,count=10;

        System.out.println("The first 10 Fibanacci series numbers are:");
        System.out.print(num1+" "+num);


        for(int i=2; i<count; ++i)
        {
            num3=num1+num;
            System.out.print(" "+num3);
            num1=num;
            num=num3;
        }
    }
}
