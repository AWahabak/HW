package Class_025.HomeWork;

import java.util.Arrays;
import java.util.HashSet;

/* HW03:
Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.
 */
public class HW03Student {
    private String name;
    private String studentId;
    public HW03Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentId;
    }
}
class StudentTester{
    public static void main(String [] args){
        HashSet<HW03Student> students = new HashSet<>();
        students.addAll(Arrays.asList(new HW03Student("Farwa","453-12"),new HW03Student("Adam","533-13"),new HW03Student("Halima","544-10")));
        for(HW03Student student:students){
            System.out.println(student.getName()+" "+student.getStudentId());
        }
    }
}
