package Class_009.HomeWork;

public class HW03_CodingDay {
    public static void main(String[] args) {
        /*
        Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding day.”.
         */

        //Way1
        String [] names={"Java","Saturday","day","coding","is"};
        System.out.println(names[1]+" "+names[4]+" "+names[0]+" "+names[3]+" "+names[2]+".");

        System.out.println("-----------------OR-----------------");

        //Way2
        String [] names2=new String[5];
            names2[0]="Java";
            names2[1]="Saturday";
            names2[2]="day";
            names2[3]="coding";
            names2[4]="is";
        System.out.println(names2[0]+" "+names2[3]+" "+names2[2]+" "+names2[4]+" "+names2[1]+".");
    }
}
