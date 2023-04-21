package GroupTasks001;

public class CT10_DuplicateStrings {
    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from
        an Array of Strings?
         */

        String [] names={"Tom","Devid","Dan","Bob","Mike","Steve","Jason","Don","Tom","John","Carlos","Bob","Mike"};

        System.out.println("The duplicate elements are: ");
        System.out.println("---------------------------");

        for (int i = 0; i<names.length; i++)
        {
            for (int j = i+1; j<names.length; j++)
            {
                if( (names[i].equals(names[j])) && (j != i) )
                {
                    System.out.print(names[j]+" ");
                }
            }
        }
    }
}
