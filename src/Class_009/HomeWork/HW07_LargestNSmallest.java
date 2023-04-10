package Class_009.HomeWork;

public class HW07_LargestNSmallest {
    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.
         */

        int [] num={123,504,2334,167,223,67,189};

        int numLargest=num[0];
        for (int i=1; i<num.length; i++){
            if(num[i]>numLargest){
                numLargest=num[i];
            }
        }
        System.out.println(numLargest);

        /*
        From an array of integer elements find the smallest number.
         */

        int numSmallest=num[0];
        for (int j=1; j<num.length; j++){
            if(num[j]<numSmallest){
                numSmallest=num[j];
            }
        }
        System.out.println(numSmallest);

    }
}
