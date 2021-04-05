public class AlternatingCharacters {

	static int alternatingCharacters(String s) {
		int count = 0;
		if (s.length() == 0 || s.length() == 1) return 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		int index = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == sb.charAt(index)) {
				count++;
			} else {
				sb.append(s.charAt(i));
				index++;
			}
		}
		return count;
	}
}
