public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {


		if (n == 0 || queries == null || queries.length == 0) {
			return -1;
		}
		long[] arr = new long[n];

		for (int[] query : queries) {
			int a = query[0] - 1;
			int b = query[1] - 1;
			int k = query[2];

			arr[a] += k;
			if (b + 1 < n) {
				arr[b + 1] -= k;
			}
		}

		long max = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
		}

		return max;
	}
}
