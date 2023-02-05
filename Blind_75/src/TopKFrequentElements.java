import java.util.*;

public class TopKFrequentElements {
    //given an array
    //return the k(can be any number) most frequent elements
    //you may return in any order
    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length + 1;


        //put all the elements of the array in a hashmap
        HashMap<Integer, Integer> mappedElements = new HashMap<>();
        for (int element : nums
        ) {
            if (mappedElements.get(element) == null) {
                mappedElements.put(element, 1);
            } else {
                mappedElements.put(element, mappedElements.get(element) + 1);
            }
        }

        ArrayList<Integer>[] al = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<Integer>();
        }
        for (int element : mappedElements.keySet()) {
            al[mappedElements.get(element)].add(element);


        }

        ArrayList<Integer> arrli = new ArrayList<Integer>();

        for (int i = al.length - 1; i > 0; i--) {


            if (!(al[i].isEmpty())) {
                for (int j :
                        al[i]) {
                    if ((arrli.size() < k)) {
                        arrli.add(j);
                    }
                }
            }

        }
        int returnArray[] = new int[k];

        for (int i = 0; i < arrli.size(); i++) {

            returnArray[i] = arrli.get(i);

        }


        return returnArray;

    }


    public static void main(String[] args) {


        int Array[] = {1, 1, 1, 2, 2, 3};


        System.out.println(topKFrequent(Array, 2)[0]);
    }


}
