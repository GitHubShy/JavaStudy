package StringQuestions;

import java.util.HashMap;

/**
 * TODO
 * To calculate the occurrences of each character in a given String
 * @author shy
 * @version 1.0
 * @date 18/08/2021 9:28 pm
 */
public class StringOccurrences {

    public static final String word = "Apple";

    public static void main(String[] args) {

        //Get each character of the String
        char[] array = word.toCharArray();

        //Using hashmap to store the occurrences of each character
        HashMap<Character,Integer> result = new HashMap();

        for (int i = 0 ; i < array.length; i++) {
            char character = array[i];
            if (result.containsKey(character)) {
                int lastNumber = result.get(character);
                result.put(character,++lastNumber);
            } else {
                result.put(character,1);
            }
        }

        System.out.println(result);


    }
}
