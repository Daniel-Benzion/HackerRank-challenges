public class DrawingBook {

	static int pageCount(int n, int p) {

		int totalFront = n / 2;
		int targetFront = p / 2;

		int back = totalFront - targetFront;

		return Math.min(targetFront, back);
	}
}
