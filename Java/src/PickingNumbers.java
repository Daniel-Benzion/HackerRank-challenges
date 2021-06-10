import java.util.*;

public class PickingNumbers {
    

    public static int pickingNumbers(List<Integer> a) {
        
        Collections.sort(a);
        int currSize = 0;
        int result = 0;
        
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                if (a.get(j) - a.get(i) <= 1) {
                    currSize++;
                } else break;
            }
            if (currSize > result) result = currSize;
            currSize = 0;
        }
        return result;
    }
}
