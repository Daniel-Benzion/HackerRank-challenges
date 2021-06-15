public class GapInPrimes {

    static boolean isPrime(long number) {
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long[] gap(int g, long m, long n) {
        long[] result = new long[2];

        long current = m;

        long first = current;

        while (current <= n) {
            if (isPrime(current)) {
                first = current;
                break;
            } else {
                current++;
            }
        }

        while (true) {
            long second = current + 1;
            current = second;

            while (current <= n) {
                if (isPrime(current)) {
                    second = current;
                    break;
                } else
                    current++;
            }

            if (isPrime(first) && isPrime(second) && second - first == g) {
                result[0] = first;
                result[1] = second;
                return result;
            } else if (!isPrime(second))
                return null;
            first = second;
            current = first;
        }
    }

}
