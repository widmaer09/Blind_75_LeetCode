import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void quickSort(int[] input,int start,int end){
        if(end-start <2){
            return;
        }
        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }
    public static int partition(int[] input,int start,int end){
        //this is using the first element as the pivot
        int pivot =input[start];
        int i= start;
        int j= end;
        while(i<j){
            while (i<j && input[--j] >=pivot);
            if(i<j){
                input[i]=input[j];

            }
            while(i<j &&input[++i] <=pivot);

            if(i<j){
                input[j] = input[i];
            }

        }
        input[j] =pivot;
        return j;


    }
    public static  HashMap<Integer, Integer>  hashEm( int array[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        int start=0;

        for (int i=1;i<array.length;i++) {
            if (array[i-1] !=array[i]-1 ){
                map.put(start,i-1);
                start =i;
                
            }else{
                map.put(start,i);
            }
            if ( array[i-1] ==array[i]) {
                map.remove(i);


            }

        }
        return map;

    }

    public static int findTheLong(HashMap<Integer, Integer> map,int array[]){
        int currentLongest=0;
        if(map.isEmpty()&&array.length>0){
            currentLongest=1;
        } else if (array.length==0) {
            currentLongest=0;

        }


        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();

            // Adding some bonus marks to all the students
            int value = (mapElement.getValue() );
            if ((value-key)>currentLongest   ){
                currentLongest =value-key+1;
            }
            return currentLongest;


        }
        return currentLongest;









    }


    public static void main(String[] args){
        int[] intArray = {1,2,0,1};
        int arrayLength= intArray.length;

        //sort the algorithm

        quickSort(intArray,0,intArray.length);

        for (int j : intArray) {
            System.out.print(j+",");
        }
        HashMap<Integer, Integer> map = hashEm(intArray);
        System.out.println(map);





        int longest = findTheLong(map,intArray);

        System.out.println(longest);


        //start traversing to find the longest sub sub








    }
}
