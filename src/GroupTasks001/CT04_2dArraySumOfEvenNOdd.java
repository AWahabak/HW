package GroupTasks001;

public class CT04_2dArraySumOfEvenNOdd {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */

        int [][] nums={
                {44,55,67,86,45,23},
                {14,51,23,21,30,700},
                {66,77,88,99,100}
        };

        int sumEven=0;
        int sumOdd=0;

        for (int i =0; i<nums.length;i++) {

            int[] arr = nums[i]; //to get 1d array
            for (int j = 0; j < arr.length; j++) { //going over the elements from the 1d array
//                System.out.print(arr[i] + " "); // test display of all elements in one line

                if(arr[j]%2==0) {
                    //System.out.print(arr[j] + " ");
                    sumEven+=arr[j];
                }

                if(arr[j]%2!=0) {
                    //System.out.print(arr[j] + " ");
                    sumOdd+=arr[j];
                }

            }
        }
        System.out.println("The sum of even numbers in 2D array are:"); //1,128
        System.out.println(sumEven);

        System.out.println("The sum odd numbers in 2D array are:"); //461
        System.out.println(sumOdd);
    }
}
