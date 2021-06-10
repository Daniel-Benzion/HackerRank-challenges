import java.util.*;

public class Permutation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        
            Map<Integer, Integer> map = new HashMap<>();
            
            int n = p.size();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                map.put(p.get(i), i);
            }
            
            int m = 1;
            while (m <= n) {
              int num = map.get(m);
              int idx = map.get(num + 1);
              arr[m - 1] = idx + 1;
              m++;  
            }
            
            List<Integer> list = new ArrayList<>();
            for (int num : arr) list.add(num);
            return list;
        }
    
}
