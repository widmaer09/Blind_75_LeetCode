
import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        //creat a set to hold allofthe contents of the array
        // hold the array


        int longest = 0;

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        //loop through the array and choose only the variables whos n-1
        //is not in the set

        for (int i = 0; i < nums.length; i++) {
            //if n-1 is not in the set
            if (!(set.contains(nums[i] - 1))) {
                int length = 0;
                //loop through set and try to find n+1
                while (set.contains(nums[i] + length)) {
                    //if n+1 is in the set increase the count
                    length += 1;
                    longest = Math.max(length, longest);
                }
            }

        }
        return longest;









    }
    public static void main(String[] args) {
        //creat a set to hold allofthe contents of the array
        // hold the array

        int nums[] = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));







    }
}
