package Class_010.HomeWork;

public class HW06_CountriesOfWorld {
    public static void main(String[] args) {
        /*
        Create 2D array of countries:
        - North American countries,
        - South American countries,
        - Europian countries,
        - Asian countries,
        - African countries.
        Then print all values from that array using 2 different loops
            and calculate how many total countries been stored.
         */


        String[][] countryOfWorld =
                {
                    {"United States", "Mexico", "Canada", "Guatemala", "Haiti", "Dominican Republic", "Cuba", "Honduras"}, // North American countries,
                    {"Brazil","Colombia","Argentina","Peru","Venezuela","Chile","Ecuador","Uruguay","Guyana","Bolivia","Falkland Islands"}, // South American countries
                    {"Germany","United Kingdom","France","Italy","Spain","Ukraine","Netherlands","Greece","Poland","Portugal"}, //Europian countries,
                    {"Afghanistan","India","Tajikistan","Pakistan","Iran","Japan","Russia","Uzbekistan","Turkmanistan","Bangladesh"}, //Asian countries
                    {"Nigeria","Ethiopia","Egypt","South Africa","Kenya","Uganda","Algeria","Morocco","Angola","Ghana"} //African countries
                };
        int numOfCountries = 0;

        for (int rows = 0; rows < countryOfWorld.length; rows++) {
            for (int columns = 0; columns < countryOfWorld[rows].length; columns++) {
                System.out.print(countryOfWorld[rows][columns] + " ");
                numOfCountries++;
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------");

        for (String[] countriesArr : countryOfWorld) {
            for (String countryName : countriesArr) {
                System.out.print(countryName + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("The number of countries list are:" + numOfCountries);
    }
}
