package Class_026.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

/* HW04:
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class HW04Duplicates {
    public static void main(String[] args) {
        var calcSum = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8,9));
        int sum = 0;
        for(var sumup: calcSum){
            sum+=sumup;
        }
        System.out.println(sum);
    }

}
