package Class_015.HomeWork;

/*
Create a Class called HW01_Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class HW01_Students {
    //variables declared
    static int studentCounter;
    String name;
    String id;

    public static void main(String[] args) {
        //objects are created
        HW01_Students st1=new HW01_Students();
        HW01_Students st2=new HW01_Students();
        HW01_Students st3=new HW01_Students();

        //values are passed
        st1.id="A1011";
        st1.name="John";
        studentCounter++;

        st2.id="B1435";
        st2.name="Tom";
        studentCounter++;

        st3.id="C3432";
        st3.name="Bob";
        studentCounter++;

        System.out.println("The total number of students are : ");
        System.out.println(HW01_Students.studentCounter);


    }


}
