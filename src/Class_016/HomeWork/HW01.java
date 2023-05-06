package Class_016.HomeWork;
    /*
    Create a method
        that will take a String as a parameter
        and returns reversed String.
            Method should be available to all classes within your project and accessible by class name.
     */
public class HW01 {
    public static String revS(String s){
        String result="";
        for(int i=s.length()-1; i>=0; i--){
            result = result + s.charAt(i);
        }
        return result;
    }

    //for testing the method
    public static void main(String[] args) {
        System.out.println(HW01.revS("Milk"));
    }



}
