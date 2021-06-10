import java.util.*;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();

        while (!arr.isEmpty()) {

            int n = arr.size();

            result.add(n);

            Collections.sort(arr);

            int lowest = arr.get(0);

            for (int i = 0; i < arr.size(); i++) {
                if (lowest >= arr.get(i)) {
                    arr.remove(i);
                    i--;
                } else {
                    arr.set(i, arr.get(i) - lowest);
                }
            }
        }
        return result;
    }
}
