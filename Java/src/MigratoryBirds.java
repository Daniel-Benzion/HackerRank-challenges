import java.util.List;

public class MigratoryBirds {

	static int migratoryBirds(List<Integer> arr) {
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;

		int highest = 0;

		for (int bird : arr) {
			switch (bird) {
				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				default:
					five++;
					break;
			}
		}

		if (one >= two && one >= three && one >= four && one >= five) {
			return 1;
		} else if (two >= three && two >= four && two >= five) {
			return 2;
		} else if (three >= four && three >= five) {
			return 3;
		} else if (four >=  five) {
			return 4;
		}
		return 5;

	}
}
