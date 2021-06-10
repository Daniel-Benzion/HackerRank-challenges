import java.util.*;

public class ServiceLane {
    

    public static List<Integer> serviceLane(int n, List<Integer> widths, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < cases.size(); i++) {
            result.add(getMin(widths, (cases.get(i)).get(0), (cases.get(i)).get(1)));
        }
        return result;
    }
    
    static int getMin(List<Integer> list, int start, int end) {
        int min = Integer.MAX_VALUE;
        
        for (int i = start; i <= end; i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }
    
}
