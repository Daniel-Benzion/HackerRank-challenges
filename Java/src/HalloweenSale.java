public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
    
        //p = starting price for 1st game
        //2nd game = p - d;
        //if price <= m price = m
        //s = budget
    
        if (p > s) return 0;
        if (p == s) return 1;
    
        int count = 0;
    
        while (true) {
        
            s -= p;
            count++;
        
            if (p > m) {
                p -= d;
                if (p < m) p = m;
            }
            if (s - p < 0) break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(16, 2, 1, 9981));
    }
    
}
