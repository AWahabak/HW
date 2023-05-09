package Class_018.HomeWork;

/* HW01
- Write a Java program called Teacher.
    Identify features and 4 behaviour of that class.
        Create 3 subclasses MathTeacher, ChemistryTeacher, and PianoTeacher that would have it their own
            features and behaviour. Test all 4 classes - HomeWork
 */
public class Teacher {
    String name;
    int age;
    int salary;
    boolean patience;
    int teachingExperience;
    boolean subjectMatterExpertise;

    void communicating(){
        System.out.println("Teacher is communicating.....");
    }
    void listening(){
        System.out.println("Teacher is listening......");
    }
    void teaching(){
        System.out.println("Teacher is teaching....");
    }
    void observing(){
        System.out.println("Teacher is observing...");
    }
}
