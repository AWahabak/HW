package Class_012.HomeWork;

public class HW01_MiddleChar {
    public static void main(String[] args) {
        /*
        Create a String
            and if the String is not empty perform the following:
                if the String has an odd number of characters
                and has 3 or more characters,
                    print the character in the middle of the String.
                          For Example String str=hello =>l
         */

        String str1=new String();
        str1="Morning";

        if(!str1.isEmpty() && !str1.isBlank()){

            if(str1.length()%2!=0 && str1.length()>=3){
                int middleIndex=str1.length()/2;
                System.out.println("The character in the middle of string is: "+str1.charAt(middleIndex));
            } else {
                System.out.println("Either the string has even number of characters or has less than three characters");
            }

        } else {
            System.out.println("The string is empty or blank");
        }






    }
}
