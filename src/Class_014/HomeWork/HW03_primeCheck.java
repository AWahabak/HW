package Class_014.HomeWork;
/*
Write a method to return whether given number is prime or not?
 */
public class HW03_primeCheck {
    int countFactor=0;
    boolean isPrime=false;
    boolean primeChecker(int num){
        if(num < 2){
            isPrime=false;
        } else if(num>=2){
            for (int i=1; i<=num;i++){
                if(num%i==0){
                    countFactor++;
                }
            }
        }
        if(countFactor==2){
            isPrime=true;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        HW03_primeCheck obj=new HW03_primeCheck();
        obj.primeChecker(4);
        System.out.println(obj.isPrime);
    }

}
