package Class_009.HomeWork;

public class HW04_CarsLoops {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
         */
        //CarsArray
        String [] cars=new String[6];
            cars[0]="Benz";
            cars[1]="BMW";
            cars[2]="Honda";
            cars[3]="Jeep";
            cars[4]="Ford";
            cars[5]="Jaguar";

        System.out.println();
        System.out.println("ForLoop__________________________");
            for (int i=0; i< cars.length; i++){
                System.out.print(cars[i]+" ");
            }

        System.out.println();
        System.out.println("WhileLoop________________________");
            int j=0;
            while (j< cars.length){
                System.out.print(cars[j]+" ");
                j++;
            }

        System.out.println();
        System.out.println("DoWhileLoop______________________");
            int k=0;
            do {
                System.out.print(cars[k]+" ");
                k++;
            } while (k<cars.length);
        System.out.println();
    }
}
