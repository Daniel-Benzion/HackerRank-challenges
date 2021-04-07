public class BeautifulDays {

	static int reverse(int x) {
		StringBuilder sb = new StringBuilder();
		while (x > 0) {
			sb.append(String.valueOf(x % 10));
			x /= 10;
		}
		return Integer.parseInt(sb.toString());
	}

	static int beautifulDays(int i, int j, int k) {
		int sum = 0;
		for (; i <= j; i++) {
			int reversed = reverse(i);
			if ((i - reversed) % k == 0) sum++;
		}
		return sum;
	}
}
