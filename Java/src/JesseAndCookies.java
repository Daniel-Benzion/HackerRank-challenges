import java.util.*;

public class JesseAndCookies {

    public static int cookies(int k, List<Integer> A) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int operations = 0;

        for (int a : A) {
            pq.add(a);
        }
        
        while (pq.size() > 1) {
            if (pq.peek() >= k) {
                return operations;
            } else {
                int cookie1 = pq.poll();
                int cookie2 = pq.poll();
                int newCookie = cookie1 + cookie2 * 2;
                pq.add(newCookie);
                operations++;
            }
        }

        if (pq.size() > 0 && pq.peek() >= k) {
            return operations;
        } else {
            return -1;
        }
    }

}
