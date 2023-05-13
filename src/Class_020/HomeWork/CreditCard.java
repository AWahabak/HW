package Class_020.HomeWork;

public class CreditCard {
    double balance;
    double interest;

    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    /*
    formula: Interest = P x R x T
    P = Principal amount (the beginning balance).
    R = Interest rate (usually per year, expressed as a decimal).
    T = Number of time periods (generally one-year time periods).
    */
    void interestCalc(){
        double result = balance*interest;
        System.out.println("The yearly credit card interest is "+result); //yearly interest
    }
}
class Visa extends CreditCard{
    Visa(double balance, double interest){
        super(balance, interest);
    }
    @Override
    void interestCalc(){
        double result = (balance*interest)/12;
        System.out.println("The monthly Visa card interest is "+result); //monthly interest
    }
}
class AX extends CreditCard{
    AX(double balance, double interest){
        super(balance, interest);
    }
    @Override
    void interestCalc(){
        double result = (balance*interest)/12/24;
        System.out.println("The daily AX card interest is "+result); //daily interest
    }
}
