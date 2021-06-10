public class MinDist {
    
    public static int minimumDistances(List<Integer> a) {

        if (a.size() <= 1) return -1;
            
        boolean noMatch = true;
    
        int min = Integer.MAX_VALUE;
            
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j< a.size(); j++) {
                
                int i1 = a.get(i);
                int j1 = a.get(j);
                    
                if (i1 == j1) {
                    int temp = j - i;
                    if (temp < min) min = temp;
                    noMatch = false;
                }
            }
        }

        if (noMatch) return -1;
        return min;
    }
}
