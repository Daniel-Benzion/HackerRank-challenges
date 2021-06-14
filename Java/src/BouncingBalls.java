public class BouncingBalls {
    
    public static int bouncingBall(double h, double bounce, double window) {
    
        if (h <= 0 || bounce <= 0 || bounce >= 1 || h <= window) return -1;
      
      
        int result = 0;
      
        while (h > window) {
          
          result++;
          h *= bounce;
          if (h > window) result++;
        }
        return result;
    }
    
}
