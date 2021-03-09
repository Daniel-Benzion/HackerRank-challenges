public class NewYearChaos {

	static void minimumBribes(int[] q) {
		int total = 0;
		int pos = 0;

		for (int i = 0; i < q.length; i++) {
			if (q[pos] - (pos + 1) > 2) {
				System.out.println("Too chaotic");
				return;
			}
			int j = 0;
			if (q[i] - 2 > 0) {
				j = q[i] - 2;
			}

			while (j <= i) {
				if (q[j] > q[i]) {
					total++;
				}
				j++;
			}
			pos++;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
		minimumBribes(q);
	}
}
