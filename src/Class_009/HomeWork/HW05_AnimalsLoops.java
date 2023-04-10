package Class_009.HomeWork;

public class HW05_AnimalsLoops {
    public static void main(String[] args) {
        /*
        Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
         */

        String [] animals=new String[5];
        animals[0]="Ant";
        animals[1]="Worm";
        animals[2]="Fish";
        animals[3]="Cat";
        animals[4]="Bird";


        System.out.println();
        System.out.println("ForLoop__________________________");
        for (int i=0; i< animals.length; i++){
            System.out.print(animals[i]+" ");
        }

        System.out.println();
        System.out.println("WhileLoop________________________");
        int j=0;
        while (j< animals.length){
            System.out.print(animals[j]+" ");
            j++;
        }

        System.out.println();
        System.out.println("DoWhileLoop______________________");
        int k=0;
        do {
            System.out.print(animals[k]+" ");
            k++;
        } while (k<animals.length);
        System.out.println();
    }
}
