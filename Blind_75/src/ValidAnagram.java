public class ValidAnagram {
    //solve this by comparing hashmaps
    //first make a hash map of all the values from string one
    //then make a hash map of all the values of string two
    // compare the two hash map objects

    public  static void ValidAnagram(String s, String t) {
        for(int i=0; i<s.length();i++){
            int n = s.length();
            char first = t.charAt(i);
            char last = s.charAt((n - 1)-i);
            System.out.println("First: " + first);
            System.out.println("Last: " + last);

        }

    }

    public static void main(String[] args) {



        ValidAnagram("anagram","nagaram");


    }

}
