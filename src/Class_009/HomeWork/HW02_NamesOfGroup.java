package Class_009.HomeWork;

public class HW02_NamesOfGroup {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
         */

        //Way1
        String [] namesOfGroupA={"Abdul", "Ana", "Egor", "Hatice", "Justin", "Lesia", "Moncef", "Vera"};
        System.out.println(namesOfGroupA[0]);

        //Way2
        String [] namesofGroupB = new String[8];
            namesofGroupB[0]="Abdul";
            namesofGroupB[1]="Ana";
            namesofGroupB[2]="Egor";
            namesofGroupB[3]="Hatice";
            namesofGroupB[4]="Justin";
            namesofGroupB[5]="Lesia";
            namesofGroupB[6]="Moncef";
            namesofGroupB[7]="Vera";
        System.out.println(namesofGroupB[0]);
    }
}
