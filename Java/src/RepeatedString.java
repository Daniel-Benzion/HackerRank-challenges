public class RepeatedString {

	static long repeatedString(String s, long n) {
		long count = 0;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'a')
				count++;

		long reps = n / s.length();
		count *= reps;


		for (int i = 0; i < n % s.length(); i++) {
			if (s.charAt(i) == 'a')
				count++;
		}

		return count;
	}

}
