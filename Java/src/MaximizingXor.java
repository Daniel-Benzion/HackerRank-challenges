public class MaximizingXor {

    public static int maximizingXor(int l, int r) {

            int max = -1;

            for (int i = l; i <= r; i++) {
                for (int j = l; j <= r; j++) {

                    int k = i ^ j;
                    if (k > max) max = k;
                }
            }

            return max;
        }    
}
