public class Mumbling {

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
          sb.append(s.substring(i, i + 1).toUpperCase());
          int j = i;
          while (j > 0) {
            sb.append(s.substring(i, i + 1));
            j--;
          }
          if (i != s.length() - 1) sb.append("-");
        }
        return sb.toString();
      }
    
}
