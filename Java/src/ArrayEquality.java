import java.util.*;

public class ArrayEquality {

    public static int equalizeArray(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for (Integer num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.replace(num, map.get(num) + 1);
            }
            if (map.get(num) > max)
                max = map.get(num);
        }
        return arr.size() - max;
    }
}