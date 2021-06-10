public class TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {

        long bLong = b;
        long wLong = w;
        long bcLong = bc;
        long wcLong = wc;
        long zLong = z;

        long b1 = bLong * bcLong;
        long b2 = (bLong * wcLong) + (bLong * zLong);
        long w1 = wLong * wcLong;
        long w2 = (wLong * bcLong) + (wLong * zLong);

        return Math.min(b1, b2) + Math.min(w1, w2);
    }

}
