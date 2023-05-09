package Class_018.HomeWork;
/* HW01
- Write a Java program called Teacher.
    Identify features and 4 behaviour of that class.
        Create 3 subclasses MathTeacher, ChemistryTeacher, and PianoTeacher that would have it their own
            features and behaviour. Test all 4 classes - HomeWork
 */
public class TeacherTester {
    public static void main(String [] args){
        PianoTeacher pianoT = new PianoTeacher();
        pianoT.name="Mike";
        pianoT.age=36;
        pianoT.levelOfExpertise="Level 9";
        System.out.println(pianoT.name+" is "+ pianoT.age+" and the level of exp is: "+ pianoT.levelOfExpertise);
        pianoT.observing();
        pianoT.pianoSoundAnalyze();
        System.out.println("-----------------------------------------------------");

        MathTeacher mathT = new MathTeacher();
        mathT.name="Mikal";
        mathT.age=28;
        mathT.passionForMath=true;
        System.out.println(mathT.name+" is "+mathT.age+" he has"+mathT.passionForMath+" passion for maths");
        mathT.communicating();
        mathT.solveProblem();
        System.out.println("-----------------------------------------------------");

        ChemistryTeacher chemistryT =  new ChemistryTeacher();
        chemistryT.name = "Bob";
        chemistryT.salary = 10000;
        chemistryT.materialKnowledge=true;
        System.out.println(chemistryT.name+"'s material knowledge is "+chemistryT.materialKnowledge);
        chemistryT.listening();
        chemistryT.chemistrySample();
        System.out.println("-----------------------------------------------------");
    }

}
