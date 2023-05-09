package Class_017.HomeWork;
/*  HW01
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
 */
public class StudentTester {
    public static void main(String[] args) {

        Student student1 = new Student("Mike",89,78,90);
        Student student2 = new Student("Mikey",98,79,63);
        Student student3 = new Student("Mikal",76,83,56);
        Student student4 = new Student("Mikain",80,75,74);
        Student student5 = new Student("Tom",73,45,93);

        student1.printAvg();
        student2.printAvg();
        student3.printAvg();
        student4.printAvg();
        student5.printAvg();
    }
}
