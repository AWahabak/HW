package GroupTasks002;
/*
7. We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage'
that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
 */
public abstract class GW07AvgMarks {
    double scoreArt, scoreMath, scoreEnglish;
    public GW07AvgMarks(double scoreArt, double scoreMath, double scoreEnglish) {
        this.scoreArt = scoreArt;
        this.scoreMath = scoreMath;
        this.scoreEnglish = scoreEnglish;
    }
    abstract double getPercentage();

    @Override
    public String toString() {
        return "GW07AvgMarks{" +
                "scoreArt=" + scoreArt +
                ", scoreMath=" + scoreMath +
                ", scoreEnglish=" + scoreEnglish +
                '}';
    }
}
class A extends GW07AvgMarks{
    public A(double scoreArt, double scoreMath, double scoreEnglish) {
        super(scoreArt, scoreMath, scoreEnglish);
    }
    @Override
    public double getPercentage(){
        double result = (scoreArt+scoreMath+ scoreEnglish)/3*100;
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "scoreArt=" + scoreArt +
                ", scoreMath=" + scoreMath +
                ", scoreEnglish=" + scoreEnglish +
                '}';
    }
}
class B extends GW07AvgMarks{
    double scoreChemistry;

    public B(double scoreArt, double scoreMath, double scoreEnglish, double scoreChemistry) {
        super(scoreArt, scoreMath, scoreEnglish);
        this.scoreChemistry = scoreChemistry;
    }
    @Override
    public double getPercentage(){
        double result = (scoreArt+scoreMath+scoreEnglish+scoreChemistry)/4*100;
        return result;
    }

    @Override
    public String toString() {
        return "B{" +
                "scoreChemistry=" + scoreChemistry +
                ", scoreArt=" + scoreArt +
                ", scoreMath=" + scoreMath +
                ", scoreEnglish=" + scoreEnglish +
                '}';
    }
}
class MarkTester{
    public static void main(String[] args) {
        GW07AvgMarks [] scores = {new A(83,65,78), new B(55,76,69,60)};
        for (GW07AvgMarks m: scores){
            System.out.println("The student "+m+" average is: "+m.getPercentage());
        }

    }


}