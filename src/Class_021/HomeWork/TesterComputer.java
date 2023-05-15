package Class_021.HomeWork;

/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. - Done
Define common behavior within and some fields in parent class - Done
    and override some methods in child classes, - Done
Define some methods specific to child classes, - Done
Create objects of child classes and store them into an array. - Done
    Loop through each object and execute available methods. - Done
 */
public class TesterComputer {
    public static void main(String [] args){

        //individual object creation and value assignment
        ParentComputer apple = new ChildApple(true, false, 14.5,8, 1024, "OSi",5.4);
        ParentComputer lenovo = new ChildLenovo(false, true, 15.0,8, 2048, "Unix",3.7);
        ParentComputer hP = new ChildHP(false, true, 17.5,8, 1536, "DOS",4.2);
        ParentComputer dell = new ChildDell(true, false, 14.5,8, 3072, "Windows",6.8);

        //individual execution of subclass specific methods
        System.out.println("----------------------------individual subClass specific methods----------------------------");
        ((ChildApple) apple).touch();
        ((ChildLenovo) lenovo).PowerSave();
        ((ChildHP) hP).hibernate();
        ((ChildDell) dell).restore();
        //individual execution of overridden methods
        System.out.println("----------------------------individual overridden methods----------------------------");
        apple.input(); apple.cPU(); apple.output();
        lenovo.input(); lenovo.cPU(); lenovo.output();
        hP.input(); hP.cPU(); hP.output();
        dell.input();

        //the above code shortened in the below array
        ParentComputer [] computersArr = {
                new ChildApple(true, false, 14.5,8, 1024, "OSi",5.4),
                new ChildLenovo(false, true, 15.0,8, 2048, "Unix",3.7),
                new ChildHP(false, true, 17.5,8, 1536, "DOS",4.2),
                new ChildDell(true, false, 14.5,8, 3072, "Windows",6.8)
        };

        //enhance loop for execution of overridden methods from all subclasses
        System.out.println("----------------------------Loop of overridden methods----------------------------");
        for(ParentComputer pc: computersArr){pc.input(); pc.cPU(); pc.output();}
    }
}
