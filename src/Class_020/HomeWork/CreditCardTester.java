package Class_020.HomeWork;
/* HW02
Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */
public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(150000,0.1882);
        Visa card2 = new Visa(150000,0.1882);
        AX card3 = new AX(150000, 0.1882);

        card1.interestCalc();
        card2.interestCalc();
        card3.interestCalc();
    }
}
