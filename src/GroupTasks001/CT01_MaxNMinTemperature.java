package GroupTasks001;

public class CT01_MaxNMinTemperature {
    public static void main(String[] args) {

        /* Analyzing the requirements
        Create a program
        that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */

        /* logic building for the requirements
        - creating of a new class - done
        - create the list of this week temperature - done
        - declaring and initialization of an array to store the list of temperatures - done
            - two arrays are created: one for max and one for min for each day - done
        - creating a loop to go through the list of temperatures - done
        - using of if condition with relative operators to identify the maximum and minimum temperature of the week. -done
            - declaration of variables for capturing max and min values - done
                //the lowest needed a very high number in order to do the compare, that is why the value is set to 1000.
            - building of the if conditions to identify and assign the max and min temperatures in the declared variables. -done
         */

        /*
        list of temperature for this week
        Max-Min,Date - Day
        -------------------------------
        56-42, 18-Apr-2023 - Tuesday
        55-36, 19-Apr-2023 - Wednesday
        55-41, 20-Apr-2023 - Thursday
        50-42, 21-Apr-2023 - Friday
        53-40, 22-Apr-2023 - Saturday
        52-38, 23-Apr-2023 - Sunday
        49-35, 24-Apr-2023 - Monday
        * the figures are in Fahrenheit
         */

        int [] maxTemps={56,55,55,50,53,52,49};
        int [] minTemps={42,36,41,42,40,38,35};

        int highest=0;
        int lowest=1000;

        for (int i = 0; i < maxTemps.length; i++) {
//            System.out.println(maxTemps[i]); // to test the loops
            if(maxTemps[i]>highest){
                highest=maxTemps[i];
            }
        }

        for (int j = 0; j < minTemps.length; j++) {
//            System.out.println(minTemps[j]); // to test the loops
            if(minTemps[j]<lowest){
                lowest=minTemps[j];
            }
        }

        System.out.println("The maximum fahrenheit is "+highest+" for this week.");
        System.out.println("The minimum fahrenheit is "+lowest+" for this week.");
    }
}
