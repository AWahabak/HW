package GroupTasks002;

class Functions{
    String reverseFunction(String input){
        String reverse="";
        for(int i=input.length()-1; i>=0; i-- ){
            reverse += input.charAt(i);
        }
        return reverse;
    }
    void palindromeChecker(String input){
        String reverse="";
        for(int i=input.length()-1; i>=0; i-- )
        {reverse += input.charAt(i);}

        if(input.equals(reverse))
        {System.out.println("The string is palindrome");}
        else    {System.out.println("The string is not palindrome");}
    }

    void countWords(String input){
        char letter=' ';
        int counter=0;
        for(int i=0;i<=input.length()-1;i++)
            {letter = input.charAt(i);
                if(letter==' ' || letter=='?' || letter=='.' || letter=='!')
                    {counter++;}}

        System.out.println("The number of words are: "+counter);
    }


}