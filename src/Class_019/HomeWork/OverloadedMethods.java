package Class_019.HomeWork;
/* HW03
    Create 1 class with a static method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe result.
 */
public class OverloadedMethods {
    static void countryInfo(String name){
        System.out.println(name+" is a beautiful country.");
    }
    static void countryInfo(String name, String capital){
        System.out.println(name+" is a beautiful country. "+capital+" is the capital of "+name+".");
    }

    static void countryInfo(String name, String capital, int population){
        System.out.println(name+" is a beautiful country. "+capital+" is the capital and "+population+" is the population of "+name+".");
    }
}
