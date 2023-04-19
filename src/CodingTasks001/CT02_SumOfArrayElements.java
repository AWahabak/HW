package CodingTasks001;

public class CT02_SumOfArrayElements {
    public static void main(String[] args) {

        /* Requirement Analysis
        Create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */

        /* Logic building
        - creating of new class - done
        - declaration and initialization of the integer array with values - done
        - test the sum of number with calculator to see if the intended result is being achieved - 476
        - declaration of integer varaiable to capture the sum of the values - done
        - sum up of the values from the created array
        */

        int [] nums={45,67,34,65,87,34,78,54,12};

        int sum=0;

        for (int i=0; i<nums.length; i++){
            // System.out.println(nums[i]); //test the display of values from the array
            sum+=nums[i];
        }

        System.out.println("The calculated sum of all stored elements in the array is "+sum+"."); // the output was 476


    }
}
