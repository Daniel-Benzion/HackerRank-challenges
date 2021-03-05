import java.util.List;

public class BillDivision {

	static void bonAppetit(List<Integer> bill, int k, int b) {

		int sum = 0;

		for (int item : bill) {
			sum += item;
		}

		sum -= bill.get(k);

		sum /= 2;

		if (sum >= b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - sum);
		}
	}
}
