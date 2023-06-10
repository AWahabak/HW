package Class_028.HomeWork;
/* HW01:
Create a method to check age eligibility
that will throw a runtime exception.
Method should throw an exception age is less than 16.
 */
public class HW01AgeCheck {
    public static void main(String[] args) {
        int age =16;
        ageEligibilityCheck(age);
    }
    static void ageEligibilityCheck(int age){
        try {
            if(age<16){
                throw new RuntimeException("Runtime Exception error");
            } else {
                System.out.println("Age is eligible");
            }
        } catch (Exception e){
            System.out.println("age is less than 16");
        }
    }
}
