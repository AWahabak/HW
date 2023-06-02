package Class_025.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* HW01:
Create a class Insurance that will have an attribute as insuranceName
and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel
and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class HW01Insurance {
    String insuranceName;
    public HW01Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    abstract double getQuote();
    abstract void cancelInsurance();
}
class Car extends HW01Insurance {
    String carModel;
    public Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    double getQuote(){
        return 2235.00;
    }
    @Override
    void cancelInsurance(){
        System.out.println("The insurance of the car "+insuranceName+" is cancelled");
    }
}
class Pet extends HW01Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    double getQuote(){
        return 530.99;
    }
    void cancelInsurance(){
        System.out.println("The insurance of the pet "+insuranceName+" is cancelled");
    }
}
class Health extends HW01Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    double getQuote(){
        return 386.76;
    }

    @Override
    void cancelInsurance(){
        System.out.println("The insurance of health "+insuranceName+" is cancelled");
    }
}
class HW01InsuranceTester{
    public static void main(String [] args){
        List<HW01Insurance> insurance = new ArrayList<>();
        insurance.add(new Car("SafeDrive","Honda"));
        insurance.add(new Pet("SafePet", "Horse"));
        insurance.add(new Health("SafeHealth"));

        //using enhance for loop
        System.out.println("-------------Ehnhance for loop--------------");
        for (HW01Insurance insure:insurance){
            System.out.println(insure.insuranceName);
            System.out.println("Annual quotation is: "+insure.getQuote());
            insure.cancelInsurance();
        }
        //using iterator
        System.out.println("-------------Iterator--------------");
        Iterator<HW01Insurance> insure = insurance.iterator();
        while(insure.hasNext()){
            HW01Insurance i = insure.next();
            System.out.println("Annual quotation is: "+i.getQuote());
            i.cancelInsurance();
        }

    }
}