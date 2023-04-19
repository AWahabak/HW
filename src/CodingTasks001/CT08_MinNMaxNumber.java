package CodingTasks001;

public class CT08_MinNMaxNumber {
    public static void main(String[] args) {

        /*
        Maximum and minimum number in the array?
         */

        int [] nums={34,56,23,56,12,78,57,45};
        int max=0;
        int min=1000000000;

        for (int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
