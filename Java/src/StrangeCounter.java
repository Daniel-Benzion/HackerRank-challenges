public class StrangeCounter {
    
    public static long strangeCounter(long t) {
        long n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        return 3 * (n - 1) - t + 1;
    }

}
