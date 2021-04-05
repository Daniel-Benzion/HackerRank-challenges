import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

	private static void makeFrequencyMap(String str, Map<String, Integer> map) {
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.substring(i, i + 1))) {
				map.put(str.substring(i, i + 1), 1);
			} else {
				map.replace(str.substring(i, i + 1), map.get(str.substring(i, i + 1)) + 1);
			}
		}
	}

	static int makeAnagram(String a, String b) {
		Map<String, Integer> mapA = new HashMap<>();
		Map<String, Integer> mapB = new HashMap<>();
		int result = 0;

		makeFrequencyMap(a, mapA);

		makeFrequencyMap(b, mapB);

		for (Map.Entry<String, Integer> pair: mapA.entrySet()) {
			if (mapB.containsKey(pair.getKey())) {
				result += Math.abs(pair.getValue() - mapB.get(pair.getKey()));
			} else {
				result += pair.getValue();
			}
		}

		for (Map.Entry<String, Integer> pair: mapB.entrySet()) {
			if (!mapA.containsKey(pair.getKey())) {
				result += pair.getValue();
			}
		}
		return result;
	}

}
