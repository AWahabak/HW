package Class_026.HomeWork;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* HW03:
reate the collection that will store single uniques Objects of a String type
in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class HW03UniqueObject {
    public static void main(String[] args) {

        var stringSet = new LinkedHashSet<>(Arrays.asList("I","go","to","school","."," ","The","place","is","nice","!"));
        String concatString="";
        for(var str: stringSet){
            concatString+=str;
        }

        System.out.println(concatString);

    }
}
