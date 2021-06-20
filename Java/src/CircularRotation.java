import java.util.*;

public class CircularRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        int n = a.size();
        int m = queries.size();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[(i + k) % n] = a.get(i);

        for (int i = 0; i < m; i++) queries.set(i, arr[queries.get(i)]);

        return queries;

    }

}
