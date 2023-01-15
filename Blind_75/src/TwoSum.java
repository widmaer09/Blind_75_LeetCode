import java.util.HashMap;

public class TwoSum {
    //we are going to put all values in the map
    // when we are at a specific indecie we will check to see if its complement is in the map
    // if it is then we retrun the current position and the and the value at the key(location) that matches the complment
    //else add into map the key and the value being the location

    public static int[] twoSum(int[] nums, int target) {

        int[] Array = new int[2];


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            if (map.containsKey(target - nums[i])) {
                Array[0] = i;
                Array[1] = map.get(target - nums[i]);
            }
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], i);

            }


        }
        for (int i : Array
        ) {
            System.out.println(i);

        }


        return Array;

    }


    public static void main(String[] args) {

        int[] array1 = {2, 4, 11, 3};
        twoSum(array1, 6);


    }
}
