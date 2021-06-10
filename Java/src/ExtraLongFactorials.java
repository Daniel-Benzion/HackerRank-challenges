import java.math.BigInteger;

public class ExtraLongFactorials {
    
    static void extraLongFactorials(int n) {
        BigInteger m = BigInteger.valueOf(n);
        
        while (n > 1) {
            m = m.multiply(BigInteger.valueOf(--n));
        }
        System.out.println(m);
    }
}
