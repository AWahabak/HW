package Class_028.HomeWork;
/* HW02:
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is
less than 5 characters.
 */
public class HW02UserNameLengthCheck {
    public static void main(String[] args) {
        String userName = "Admin";
        userNameCheck(userName);
    }
    static void userNameCheck(String userName){
        try{
            if (userName.length()<5){
                throw new RuntimeException("Run time exception error");
            } else {
                System.out.println("userName is more than 4 characters");
            }
        } catch (Exception e){
            System.out.println("userName is less than 5 characters");
        }
    }

}
