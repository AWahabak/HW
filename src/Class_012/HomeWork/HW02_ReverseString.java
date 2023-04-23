package Class_012.HomeWork;

public class HW02_ReverseString {
    public static void main(String[] args) {

        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String str1=new String();
        str1="milk"; // the reverse should be klim

        for (int i=str1.length()-1; i>=0; i--){
            System.out.print(str1.charAt(i));
        }
    }
}
