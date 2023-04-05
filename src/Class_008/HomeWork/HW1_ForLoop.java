package Class_008.HomeWork;

public class HW1_ForLoop {
    public static void main(String[] args) {
        /*
        Print numbers from 1 to 50
            except those that are dividable by 3
         */

        for(int num=1; num<=50; num++) {
            if(num%3!=0) {
                System.out.print(num+" ");
            }
        }

    }
}
