public class SherlockAndSquares {
    

    public static int squares(int a, int b) {
    
        int count = 0;
        int nextSq = (int)Math.floor(Math.sqrt(a));
        
        if ((Math.floor(Math.sqrt(a)) == Math.sqrt(a)) && nextSq == Math.floor(Math.sqrt(a))) {
            count++;
        }
        
        while (true) {
            ++nextSq;
            if (nextSq > Math.sqrt(a) && nextSq < Math.sqrt(b)) {
                count++;
            }
            if ((Math.floor(Math.sqrt(b)) == Math.sqrt(b)) && nextSq == Math.floor(Math.sqrt(b))) {
                count++;
                break;
            }
            if (nextSq > Math.sqrt(b)) break;
        }
        return count;   
    }
}
