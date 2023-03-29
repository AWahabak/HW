package Class_002.HomeWork;
public class HW_Variables {
    public static void main(String[] args) {
        //Step 1
            /*
            Different type variables creation (both variable declaration and value initialization)
            for students' information
            */
            String str_name="Mike";
            String str_lastName="Ken";
            String str_grade="C";
            String str_city="Washington";
            String str_state="DC";
            String str_phone_number="+1-202-45964355";
        //Step 2
            //Change of students' city, state, phone number, and grade
            str_city="New York City";
            str_state="New York";
            str_grade="B";
            str_phone_number="+1-646-6543454";
        //Step 3
        //Print variable values
        System.out.println("My name is "+str_name+" and my last name is "+str_lastName+".");
        System.out.println("I am now a "+str_grade+" grade student.");
        System.out.println("I recently moved to "+str_city+"; "+str_state+".");
        System.out.println("My phone number is also changed to ".concat(str_phone_number)+".");
        //End
    }
}
