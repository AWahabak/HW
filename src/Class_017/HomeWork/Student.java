package Class_017.HomeWork;
/*  HW01
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
 */
public class Student {
    String nameStudent;
    int subEnglish, subPhysics, subChemistry;

    Student(String name, int subEnglish, int subPhysics, int subChemistry){
        this.nameStudent = name;
        this.subEnglish = subEnglish;
        this.subPhysics = subPhysics;
        this.subChemistry = subChemistry;
    }

   void printAvg(){
       double result=0;
       result = (subEnglish+subPhysics+subChemistry)/3;
       System.out.println(nameStudent+"'s average is "+result);
   }

}
