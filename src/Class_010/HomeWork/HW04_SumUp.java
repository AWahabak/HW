package Class_010.HomeWork;

public class HW04_SumUp {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
         */

        int[][] nums =
                {
                    {9, 12, 13},
                    {41, 53, 36},
                    {78, 28, 18}
                };

        int sumUp = 0;
        for (int[] digits : nums)
            {
                for (int intNum : digits)
                    {
                    sumUp = intNum + sumUp;
                    }
            }

        System.out.println("The sumup of all numbers is:");
        System.out.println(sumUp);
    }
}
