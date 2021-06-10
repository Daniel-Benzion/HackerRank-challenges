public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
    
        int count = 0;
        int wrappers = 0;
    
        while (true) {
            n -= c;
            if (n < 0) break;
            count++;
            wrappers++;
        }
        
        while (true) {
            wrappers -= m;
            if (wrappers < 0) break;
            count++;
            wrappers++;
        }
        
        return count;
    }
    
}
