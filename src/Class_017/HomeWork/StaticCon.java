package Class_017.HomeWork;
/* HW03
Write program that have static constructor and observe result.
 */
public class StaticCon {
        String name;
        int age;
        String country;

    StaticCon(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

//    static StaticCon(String name, String country) {
//        this.name = name;
//        this.age = age;
//        this.country = country;
//    }

    /*
    compile error: static keyword is not allowed
    the main reasons are that the constructor will not be accessible or callable from a subclass
     */

}
