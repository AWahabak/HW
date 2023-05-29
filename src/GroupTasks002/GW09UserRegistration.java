package GroupTasks002;
/*
9. Create Registration Class in which you would have variables as email,
userName and password that have an access scope only within its own class.
After creating an object of the class user should be able to call methods
and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.
 */
public class GW09UserRegistration {
    private String email, username, password;
    void setUserEmailAdd(String email){
        this.email = email;
        if(email.endsWith("yahoo.com")){
            System.out.println("Email Created");
        } else {
            System.out.println("Email Not Acceptable");
        }
    }
    void setUserName(String username){
        this.username = username;
        if(username.isEmpty() || username.isBlank()){
            System.out.println("Please enter username");
        } else if(username.length()>6){
            System.out.println("Created UserName");
        }
    }
    void setPassword(String password){
        this.password = password;
        if(password.length()>6 || !password.isEmpty() || !password.isBlank() || !password.contains(username)){
            System.out.println("Accepted Password");
        }
    }
    static class UserRegisrtrationTester{
        public static void main(String[] args) {

            GW09UserRegistration reg1 = new GW09UserRegistration();
            reg1.setUserEmailAdd("Johnmikle435@yahoo.com");
            reg1.setUserName("JohnMikle");
            reg1.setPassword("GoldenTube132!@#");


        }
    }
}
