import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> allValues = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {
            if (allValues.contains(nums[i])) {

                return true;
            } else {
                allValues.add(nums[i]);
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int Arraytest[] = {1, 2, 3, 1};


        System.out.println(containsDuplicate(Arraytest));


    }


}