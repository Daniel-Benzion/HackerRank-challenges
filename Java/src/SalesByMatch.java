import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {

	static int sockMerchant(int n, int[] ar) {

		int pairs = 0;

		List<Integer> checker = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (checker.contains(ar[i])) {
				checker.remove(Integer.valueOf(ar[i]));
				pairs++;
			} else {
				checker.add(ar[i]);
			}
		}

		return pairs;
	}


}
