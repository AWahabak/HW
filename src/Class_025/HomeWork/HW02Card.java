package Class_025.HomeWork;

import java.util.Arrays;
import java.util.LinkedList;

/* HW02
Create a Card class that will have interest rate field
and card type and a constructor that will initialize the fields.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/iterator access all methods of the class.
 */
public class HW02Card {
    private double interestRate;
    private String cardType;
    public HW02Card(double interestRate, String cardType){
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public String getCardType(){
        return cardType;
    }
}
class CardTester {
    public static void main(String[] args) {
        LinkedList<HW02Card> cards = new LinkedList<>();
        cards.addAll(Arrays.asList(new HW02Card(4.3,"BlueCard"), new HW02Card(2.3,"RedCard"), new HW02Card(7.3,"GoldCard")));
        for(HW02Card card:cards){
            System.out.println(card.getCardType()+" "+card.getInterestRate());
        }
    }
}