public class StrangeAdvertising {

	static int viralAdvertising(int n) {
		int shared = 5;
		int liked = 2;
		int cumulative = 2;
		for (int i = 2; i <= n; i++) {
			shared = liked * 3;
			liked = shared / 2;
			cumulative += liked;
		}
		return cumulative;
	}
}
