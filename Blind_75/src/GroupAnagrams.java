import java.util.*;

public class GroupAnagrams {

    //make a hashmap with keys being a hashmap and values being an array list
    //travers the hashmap to see if theres a key with the present hashmap
        //if there is add the index of the current iteration to that hasmap list
        //else add the current iteration
    //lastly read through the main hashmap make a arraylist of the current values of the current key
    //add that list to the main arraylist
    // return the main arraylist
    public static void countValues(String input, HashMap<Character, Integer> map) {

        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);

            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }


    }

    public static List< List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, ArrayList<String>> hashmap = new HashMap<HashMap<Character, Integer>,ArrayList<String>>();

        List<List<String>> returnList= new ArrayList<List<String>>();

        //ArrayList<ArrayList<String>> returnList = new List<ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            countValues(strs[i],map);
            if (hashmap.containsKey(map)){


                ArrayList<String> newArray = hashmap.get(map);



                newArray.add(strs[i]);



                hashmap.put(map,newArray);


            }else {
                ArrayList<String> newList = new ArrayList<>();

                newList.add(strs[i]);
                hashmap.put(map,newList);
            }

           // returnList.add(hashmap.get(map))



        }
        int i = 0;

        hashmap.forEach((k, v) ->returnList.add(v) );











        return returnList;

    }

    public static void main(String[] args){
        String[] array = new String[] {"eat","tea","tan","ate","nat","bat"};

        List<ArrayList<String>> returnList = new ArrayList<ArrayList<String>>();

        System.out.println(groupAnagrams(array));








    }
}
