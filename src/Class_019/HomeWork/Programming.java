package Class_019.HomeWork;
/* HW02
    Create a class named 'Programming'.
        While creating an object of the class,
            if nothing is passed to it, then the message "I love programming languages" should be printed.
            If some String is passed to it, then in place of "programming languages" the value variable should be printed.
                Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Programming {
    static void program(){
        System.out.println("I love programming languages.");
    }

    static void program(String name){
        System.out.println("I love "+name+".");
    }
}
