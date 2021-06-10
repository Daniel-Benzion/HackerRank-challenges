import java.util.*;

public class KaprekarNumbers {

    public static void kaprekarNumbers(int p, int q) {
            
            List<String> result = new ArrayList<>();
            
            for (long i = p; i <= q; i++) {
                
                if (i == 1) {
                    result.add("1");
                    continue;
                } else if (i < 9) continue;
                
                String n = i + "";
                
                int d = n.length();
                
                long i2 = i * i;
                
                String n2 = "" + i2;
                
                int index = n2.length();
                
                if (d == 1) {
                    index = 1;
                } else {
                    while (d > 0) {
                        index--;
                        d--;
                    }  
                }
                
                
                String right = n2.substring(index);
                String left = n2.substring(0, index);
                
                long rint = Long.parseLong(right);
                long lint = Long.parseLong(left);
                
                
                
                if (rint + lint == i) result.add(n);
            }
            if (result.isEmpty()) System.out.println("INVALID RANGE");
            else for (String num : result) System.out.print(num + " ");
        }
}
