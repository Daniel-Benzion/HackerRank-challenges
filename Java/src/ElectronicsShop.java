public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int max = -1;
		for (int key : keyboards) {
			for (int drive : drives) {
				if (key + drive > max && key + drive <= b) max = key + drive;
			}
		}
		return max;
	}
}
