import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> magazineWords = new HashMap<>();

		for (String s : magazine) {
			magazineWords.merge(s, 1, Integer::sum);
		}

		for (String s : note) {
			Integer wordCount = magazineWords.get(s);
			if (wordCount == null || wordCount == 0) {
				System.out.println("No");
				return;
			} else {
				magazineWords.put(s, wordCount - 1);
			}
		}
		System.out.println("Yes");
	}
}
