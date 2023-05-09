package Class_018.HomeWork;
    /* HW01
    - Write a Java program called Teacher.
        Identify features and 4 behaviour of that class.
           Create 3 subclasses MathTeacher, ChemistryTeacher, and PianoTeacher that would have it their own
                features and behaviour. Test all 4 classes - HomeWork
     */
public class PianoTeacher extends Teacher {
     boolean isPianoExpert;
     String levelOfExpertise;
     void pianoNotesProvide (){System.out.println("Providing piano notes......");}
     void pianoSoundAnalyze(){System.out.println("Analyzing the piano sound........");}
     void pianoLessonPractice(){System.out.println("Giving piono practice lessons to students........");}
}
