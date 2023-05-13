package Class_020.HomeWork;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a bachelors degree, you need to have at least school diploma");
    }
}
class Masters extends Degree {
    @Override
    void getPrerequisite(){
        System.out.println("To get a masters degree, you need a bachelors degree");
    }
}

