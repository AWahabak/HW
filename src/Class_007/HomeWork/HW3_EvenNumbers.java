package Class_007.HomeWork;

public class HW3_EvenNumbers {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (3 ways)

        //Way 1
        int num1=20;
            while(num1>=1){
                if(num1%2==0){
                    System.out.print(num1+" ");
                }
                num1--;
            }
        System.out.println();

        //Way2
        int num2=20;
            do {
                if (num2%2==0){
                    System.out.print(num2+" ");
                }
                num2--;
            } while (num2>=1);
        System.out.println();

        //Way 3
        for (int num3=20; num3>=1; num3--){
            if(num3%2==0){
                System.out.print(num3+" ");
            }
        }


    }
}
