public class JumpingOnCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {
        // jump size k
        // c.length == n;
        // c[(i + k) % n]

        int n = c.length;
        int i = 0;
        int energy = 100;

        while (true) {
            int j = (i + k) % n;

            energy--;
            if (c[j] == 1) {
                energy -= 2;
            }
            if (j == 0)
                break;
            i = j;
        }
        return energy;
    }
}
