public class HurdleRace {

	static int hurdleRace(int k, int[] height) {
		int max = 0;

		for (int num : height) {
			if (num > max) max = num;
		}
		if (k >= max) return 0;
		return max - k;
	}
}
