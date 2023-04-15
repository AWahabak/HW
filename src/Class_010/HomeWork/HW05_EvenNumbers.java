package Class_010.HomeWork;

public class HW05_EvenNumbers {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */


            int[][] nums =
                    {
                        {9, 12, 13},
                        {41, 53, 36},
                        {78, 28, 18}
                    };

            for (int[] i : nums)
                {
                for (int numEven : i)
                    {
                        if (numEven % 2 == 0)
                        {
                            System.out.print(numEven + " ");
                        }
                    }
                }

    }
}
