import java.util.*;

public class TS {

    public static int[] tS(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        //store: integer, index

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[0];
    }
    


    
}
