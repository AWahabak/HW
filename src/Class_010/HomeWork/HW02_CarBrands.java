package Class_010.HomeWork;

public class HW02_CarBrands {
    public static void main(String[] args) {

        /*
        Create 2D array of cars: American, German, Korean, Italian.
        Then retrieve all values from that array using 2 different loops
         */

        String[][] carsBrands = {
                {"Ford", "Chevy", "GMC", "Jeep"}, // American
                {"Porsche","Mercedes-Benz","BMW","Audi"}, // German
                {"Hyundai","Kia","KG"}, //Korean
                {"Alfa Romeo","Lamborghini", "Maserati"} // Italian
        };


        for (int rows = 0; rows < carsBrands.length; rows++)
            {
            for (int columns = 0; columns < carsBrands[rows].length; columns++)
                {
                System.out.print(carsBrands[rows][columns] + " ");
                }
            System.out.println();
        }
        System.out.println();

        for (String[] carBArr : carsBrands)
            {
            for (String carBNames : carBArr)
                {
                System.out.print(carBNames + " ");
                }
            System.out.println();
            }

    }
}
