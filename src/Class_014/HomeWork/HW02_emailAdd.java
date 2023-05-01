package Class_014.HomeWork;

/*
Create a method createEmail().
    Based on values of users firstName, lastName and email type,
        your method should return complete email Address.
        Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */
public class HW02_emailAdd {
    String createEmail(String firstName, String lastName, String emailType){
        String emailAdd=firstName+lastName+"@"+emailType+".com";
        return emailAdd;
    }

    public static void main(String[] args) {
        HW02_emailAdd emailBuild=new HW02_emailAdd();
        String output=emailBuild.createEmail("John","Snow","Gmail");
        System.out.println(output.toLowerCase()); //the lowercase method can be coded in method as well
    }
}
