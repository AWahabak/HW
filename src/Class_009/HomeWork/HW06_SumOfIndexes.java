package Class_009.HomeWork;

public class HW06_SumOfIndexes {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements in an array
        */

        int [] num={23,54,34,67,23,67,89};

        //Way1 - if the number of indexes are clear
        int sum=0;
        sum=num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6];
        System.out.println("The sum of all elements is "+sum+".(Manually)");

        //Way2 - if the number of indexes are not clear using for loop
        int sum2=0;
        for(int i=0;i<num.length;i++){
            sum2+=num[i];
        }
        System.out.println("The sum of all elements is "+sum2+".(WithForLoop)");

        //Way3 - if the number of indexes are not clear using do while loop
        int sum3=0;
        int j=0;
        do {
            sum3+=num[j];
            j++;
        } while (j<num.length);
        System.out.println("The sum of all elements is "+sum3+".(WithDoWhileLoop)");

        //Way4 - if the number of indexes are not clear using While loop
        int sum4=0;
        int k=0;
        while (k<num.length) {
            sum4+=num[k];
            k++;
        }
        System.out.println("The sum of all elements is "+sum4+".(WithWhileLoop)");
    }
}
