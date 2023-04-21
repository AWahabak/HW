package GroupTasks001;

public class CT03_2dArrayEvenNumsOnly {
    public static void main(String[] args) {

        /* Analysis of requirement
        Create a 2D array of integer type
            where you will store odd and even numbers.
        Develop a program which
            will identify/print the even numbers only.
         */

        /* logic development
        - create a class - done
        - create 2D array of integer and store odd and even values/elements - done
        - creation of variable to capture the elements from 2D array into 1D array - done
        - test the display of elements from the 2Day array by loop - done
        - addition of if condition to identify the even number only - done
        - print out of even numbers only (in one line) - done
        */

        int [][] nums={
                {44,55,67,86,45,23},
                {14,51,23,21,30,700},
                {66,77,88,99,100}
        };

        System.out.println("The even numbers in 2D array are:");

        for (int i =0; i<nums.length;i++) {

            int[] arr = nums[i]; //to get 1d array
            for (int j = 0; j < arr.length; j++) { //going over the elements from the 1d array
//                System.out.print(arr[i] + " "); // test display of all elements in one line

                if(arr[j]%2==0){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
