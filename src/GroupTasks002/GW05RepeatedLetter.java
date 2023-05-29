package GroupTasks002;
/*
5. Find the First Non-Repeating Character in a String:
Given a string, find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */
public class GW05RepeatedLetter {
    public static void main(String[] args) {

        String str = "abracadabra";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            boolean isRepeat = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && character == str.charAt(j)) {
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat) {
                System.out.println("single use characters are :"+character);
            }
        }
    }
}
