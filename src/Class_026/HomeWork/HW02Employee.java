package Class_026.HomeWork;

import java.util.TreeMap;

/* HW02:
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class HW02Employee {
    public static void main(String[] args) {

        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Mike",45000);
        employee.put("Mek",56000);
        employee.put("Mekau",34000);
        employee.put("Smith",100000);

        int highestSalary = 0;
        String highestPaidEmployee="";

        for (var emp: employee.entrySet()){
            if(emp.getValue()>highestSalary){
                highestSalary = emp.getValue();
                highestPaidEmployee = emp.getKey();
            }
        }

        System.out.println(highestPaidEmployee+" "+highestSalary);
    }
}
