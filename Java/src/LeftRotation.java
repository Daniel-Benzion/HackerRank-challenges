import java.util.*;

public class LeftRotation {

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        Integer[] array = new Integer[n];
        for(int i = 0; i < n; i++) {
            array[(i + n - d) % n] = arr.get(i);
        }
        List<Integer> result = new ArrayList<>();
        Collections.addAll(result, array);
        return result;
    }

	public static void main(String[] args) {
		Integer[] a = {1, 2, 3, 4, 5};
		List<Integer> tester = Arrays.asList(a);
		System.out.println(tester);
		System.out.println(rotateLeft(1, tester));
	}
}
