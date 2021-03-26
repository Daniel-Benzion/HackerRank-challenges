public class MinimumSwaps2 {

	static int minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i + 1) continue;
			count++;
			int temp = arr[i];
			arr[i] = arr[temp - 1];
			arr[temp - 1] = temp;
			i--;
		}
		return count;
	}
}
