import java.util.HashMap;
import java.util.Map;

public class IsValid {

	private static void makeFrequencyMap(String str, Map<String, Integer> map) {
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.substring(i, i + 1))) {
				map.put(str.substring(i, i + 1), 1);
			} else {
				map.replace(str.substring(i, i + 1), map.get(str.substring(i, i + 1)) + 1);
			}
		}
	}

	static String isValid(String s) {
		String result = "YES";
		if (s.length() == 0 || s.length() == 1) return "YES";
		Map<String, Integer> map = new HashMap<>();
		makeFrequencyMap(s, map);
		int current = map.get(s.substring(0, 1));
		System.out.println(current);
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			if (pair.getValue() != current) {
				System.out.println("Error happens here: current = " + current + ", pair value = " + pair.getValue() + ", key value = " + pair.getKey());
				if (pair.getKey().equals(s.substring(1, 2)) && (pair.getValue() - 1 == current || pair.getValue() == 1 && current == 2)) {
					result = "YES";
				} else {
					result = "NO";
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "abcdefghhgfedecba";
		System.out.println(isValid(s));
	}
}
