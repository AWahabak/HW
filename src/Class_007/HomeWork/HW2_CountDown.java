package Class_007.HomeWork;

public class HW2_CountDown {
    public static void main(String[] args) {
        //Print numbers from 100 to 1 (3 Ways)

        //Way 1
        int num1=100;
        while(num1>=1){
            System.out.print(num1+" ");
            num1--;
        }
        System.out.println();

        //Way2
        int num2=100;
        do {
            System.out.print(num2+" ");
            num2--;
        } while (num2>=1);
        System.out.println();

        //Way 3
        for (int num3=100; num3>=1; num3--){
            System.out.print(num3+" ");
        }

    }
}
