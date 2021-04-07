public class CatAndMouse {

	static String catAndMouse(int x, int y, int z) {
		int catA = Math.abs(z - x);
		int catB = Math.abs(z - y);
		if (catA < catB) return "Cat A";
		if (catB < catA) return "Cat B";
		return "Mouse C";
	}
}
