public class ReverseArray {

	static int[] reverseArray(int[] a) {
		int[] result = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[j] = a[i];
			j++;
		}
		return result;
	}
}
