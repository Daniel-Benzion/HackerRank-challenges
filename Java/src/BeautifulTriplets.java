import java.util.*;

public class BeautifulTriplets {
    

    public static int beautifulTriplets(int d, List<Integer> arr) {
        
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int num : arr) {
                
                if (map.containsKey(num)) {
                    map.replace(num, map.get(num)+1);
                } else {
                    map.put(num, 1);
                }
            }
            int count = 0;
            for (Integer i : map.keySet()) {
                if (map.containsKey(i + d) && map.containsKey(i + 2 * d)) {
                   count += Math.max(
                                    map.get(i),
                                    Math.max(
                                        map.get(i + d),
                                        map.get(i + 2 * d)
                                    )
                            );
                }
            }
            return count;
        }
}
