public class Greed {

    public static int greedy(int[] dice) {
        int count = 0;

        int[] quant = { 0, 0, 0, 0, 0, 0, 0 };
        for (int j : dice)
            quant[j]++;

        for (int i = 1; i < quant.length; i++) {
            if (i == 1) {
                count += (quant[i] > 2 ? 1000 + (quant[1] - 3) * 100 : quant[1] * 100);
            } else if (i == 5) {
                count += (quant[i] > 2 ? 500 + (quant[5] - 3) * 50 : quant[5] * 50);
            } else {
                count += (quant[i] > 2 ? i * 100 : 0);
            }
        }

        return count;
    }

}
