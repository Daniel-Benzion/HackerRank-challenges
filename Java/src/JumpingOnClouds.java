public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int i = 0;

		while (true) {
			if (i + 2 < c.length && c[i + 2] == 0) {
				i += 2;
				jumps++;
			} else if (i + 1 < c.length && c[i + 1] == 0) {
				i++;
				jumps++;
			} else {
				break;
			}
		}
		return jumps;
	}
}
