public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] result = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			for (String str : strings) {
				if (queries[i].equals(str)) {
					result[i]++;
				}
			}
		}
		return result;
	}
}
