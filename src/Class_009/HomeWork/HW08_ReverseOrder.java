package Class_009.HomeWork;

public class HW08_ReverseOrder {
    public static void main(String[] args) {
        /*
        Create an array to store char values and then print those in reverse order
        */

        char [] symbols={'!','@','#','$','%'};

        //actual order
        System.out.println("Actual order__________________");
        for(int i=0; i<symbols.length; i++){
            System.out.print(symbols[i]+" ");
        }

        //reverse order
        System.out.println();
        System.out.println("Reverse order_________________");
        for(int j=symbols.length-1; j>=0; j--){
            System.out.print(symbols[j]+" ");
        }

    }
}
