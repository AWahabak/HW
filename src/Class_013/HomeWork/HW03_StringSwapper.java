package Class_013.HomeWork;

public class HW03_StringSwapper {
    public static void main(String[] args) {

        /*
        How would you swap  2 strings without a temporary variable?
         */

        String str1="Eating";
        String str2="Food";

        System.out.println("Before swapping str1: "+str1);
        System.out.println("Before swapping str2: "+str2);

        //logic
        str1=str1+str2; //joins both strings
        str2=str1.substring(0,str1.length()-str2.length()); //str2 is replaced with str1
        str1=str1.substring(str2.length()); //str1 is replaced with str2

        System.out.println("Swapping-------------------");

        System.out.println("After swapping str1: "+str1);
        System.out.println("After swapping str2: "+str2);


    }
}
