package Class_007.HomeWork;

public class HW1_CountUp {
    public static void main(String[] args) {
        //Print numbers from 1 to 100 in 1 line with space (3 ways)

        //Way 1
        int num1=1;
        while(num1<=100){
            System.out.print(num1+" ");
            num1++;
        }
        System.out.println();

        //Way2
        int num2=1;
        do {
            System.out.print(num2+" ");
            num2++;
        } while (num2<=100);
        System.out.println();

        //Way 3
        for (int num3=1; num3<=100; num3++){
            System.out.print(num3+" ");
        }
    }
}
