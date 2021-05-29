public class EndsWith {
    
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) return false;

        if (ending.equals(str.substring((str.length() - 1) - (ending.length() - 1)))) return true;
        return false;
      }

      public static void main(String[] args) {
          System.out.println(solution("samurai", "ai"));
      }
}
