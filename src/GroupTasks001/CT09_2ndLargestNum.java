package GroupTasks001;

public class CT09_2ndLargestNum {
    public static void main(String[] args) {

        /*
        Write a java program to find the second largest
        number in the array?
         */

        int [] nums={34,56,23,56,12,78,57,45};

        int max=0;
        int max2nd=0;

        for (int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(max!=nums[i] && nums[i]>max2nd){
                max2nd=nums[i];
            }
        }

        System.out.println(max2nd);
    }
}
