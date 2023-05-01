package Class_014.HomeWork;
/*
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class HW04_Student {
    char studentGrader(int score){
        char grade='F';
        if(score>90 && score<=100){
            grade='A';
        } else if(score>80 && score<=90){
            grade='B';
        } else if(score>70 && score<=80){
            grade='C';
        } else if (score>50 && score<=70){
            grade='D';
        } else if (score>0 && score<=50){
            grade='F';
        } else {
            grade='?';
        }
        return grade;
    }

    public static void main(String[] args) {
        HW04_Student whatGrade=new HW04_Student();
        char grade=whatGrade.studentGrader(65);
        System.out.println(grade);
    }
}
