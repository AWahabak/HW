package Class_010.HomeWork;

public class HW01_StudentGrading {
    public static void main(String[] args) {
    /*
    Create a 2D array (shorter way) in which first array will consist of 4 names
    and second array will contain grades.
    Then your program should print name of the students that has A and B grade
     */

        String [][] names2d={
                {"Tom","John","Mike","Dan"},
                {"B","D","A","C"}
        };
          // Simple way
//       System.out.println(names[0][0]);
//       System.out.println(names[0][2]);

        for (int i = 0; i < names2d[0].length; i++)
        {
            String student = names2d[0][i];
            String grading = names2d[1][i];
            if(grading.equals("A") || grading.equals("B")){
                System.out.println(student);
            }

        }



    }
}
