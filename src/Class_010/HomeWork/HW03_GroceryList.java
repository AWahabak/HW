package Class_010.HomeWork;

public class HW03_GroceryList {
    public static void main(String[] args) {

        /*
        Using 2D array create a groccery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */

        String[][] grocceryList = {
                {"Spinach","Broccoli","Peas","Potato","Carrots"}, //veggies
                {"Strawberries","Apples","Watermelon","Banana","Orange"}, //fruits
                {"Milk","Yogurt","Cheese","Butter"}, //dairy
                {"Cadbury","Loin Bar","Flake","Double Decker","Chocolate"} //sweets
        };


        for (int rows = 0; rows < grocceryList.length; rows++)
        {
            for (int columns = 0; columns < grocceryList[rows].length; columns++)
            {
                System.out.print(grocceryList[rows][columns] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] grocceryA : grocceryList)
        {
            for (String grocceryNames : grocceryA)
            {
                System.out.print(grocceryNames + " ");
            }
            System.out.println();
        }



    }
}
