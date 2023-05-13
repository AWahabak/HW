package Class_020.HomeWork;
/* HW01
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */
public class DegreeTester {
    public static void main(String[] args) {
        Degree student1 = new Degree();
        Bachelors student2 = new Bachelors();
        Masters student3 = new Masters();

        student1.getPrerequisite();
        student2.getPrerequisite();
        student3.getPrerequisite();

    }
}
