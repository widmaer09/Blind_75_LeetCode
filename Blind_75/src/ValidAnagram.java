import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    //solve this by comparing hashmaps
    //first make a hash map of all the values from string one
    //then make a hash map of all the values of string two
    // compare the two hash map objects

    public static void countValues(String input, HashMap<Character, Integer> map) {

        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);

            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }


    }

    public static boolean ValidAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        countValues(s, map);
        countValues(t, map2);


        if (map.equals(map2)) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(ValidAnagram("anagram", "nagaram"));
    }

}
