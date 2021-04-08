public class FindDigits {

	static int findDigits(int n) {
		int total = 0;
		int checker = n;
		while (checker > 0) {
			int sum = checker % 10;
			checker /= 10;
			if (sum == 0) continue;
			if (n % sum == 0) total++;
		}
		return total;
	}
}
