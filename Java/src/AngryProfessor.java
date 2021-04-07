public class AngryProfessor {

	static String angryProfessor(int k, int[] a) {
		int h = 0;
		for (int time : a) {
			if (time <= 0) h++;
		}
		if (h < k) return "YES";
		return "NO";
	}
}
