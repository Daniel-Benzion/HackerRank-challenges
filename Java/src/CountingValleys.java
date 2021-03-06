import java.util.ArrayList;

public class CountingValleys {


	public static int countingValleys(int steps, String path) {
		int sea = 0;
		int valleys = 0;
		ArrayList<Integer> elev = new ArrayList<>();
		boolean inValley = false;

		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				sea++;
			} else {
				sea--;
			}
			elev.add(sea);
		}

		for (int value : elev) {
			if (value < 0 && !inValley) {
				valleys++;
				inValley = true;
			}
			if (value >= 0 && inValley) {
				inValley = false;
			}
		}
		return valleys;
	}
}
