package Class_026.HomeWork;

import java.util.TreeMap;

/* HW01:
Create a Person class with following private fields:
name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
public class HW01Person {
    private String name, lastName;
    private int age, salary;
    public HW01Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString(){
        String output = "The person's full name is: "+name+" "+lastName+". He is "+age+" years old and he has "+salary+" salary.";
        return output;
    }
}
class PersonTester{
    public static void main(String [] args){
        var person = new TreeMap<>();
        person.put(1, new HW01Person("John","Smith",24,100000));
        person.put(2, new HW01Person("Jack","Deniel",45,120000));
        person.put(3, new HW01Person("Jimmy","J",32,150000));
        person.put(4, new HW01Person("Aja","Naja",65,160000));

        for(var per:person.entrySet()){
            System.out.println(per.getKey()+" "+per.getValue());
        }


    }

}

