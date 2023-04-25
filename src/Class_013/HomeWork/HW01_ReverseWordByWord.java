package Class_013.HomeWork;

public class HW01_ReverseWordByWord {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
                // input=>This is sentence i want to reverse
                // output=>sihT si ecnetnes i tnaw ot esrever
         */

        String sentenceOrder=new String();
        StringBuilder sentenceReverse=new StringBuilder();

        sentenceOrder="This is a sentence I want to reverse"; // the reverse should be klim
        String [] wordArray=sentenceOrder.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            StringBuilder wordReverse=new StringBuilder(wordArray[i]).reverse();
            sentenceReverse.append(wordReverse+" "); //instead of .append() method +" " is used to add space
        }

        System.out.println(sentenceOrder+"."); //prints the original
        System.out.println(sentenceReverse.toString().trim()+"."); //prints the reverse word by word

    }
}
