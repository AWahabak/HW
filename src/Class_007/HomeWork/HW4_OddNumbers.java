package Class_007.HomeWork;

public class HW4_OddNumbers {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)

        //Way 1
        int num1=20;
        while(num1<=50){
            if(num1%2!=0){
                System.out.print(num1+" ");
            }
            num1++;
        }
        System.out.println();

        //Way2
        int num2=20;
        do {
            if (num2%2!=0){
                System.out.print(num2+" ");
            }
            num2++;
        } while (num2<=50);
        System.out.println();

        //Way 3
        for (int num3=20; num3<=50; num3++){
            if(num3%2!=0){
                System.out.print(num3+" ");
            }
        }

    }
}
