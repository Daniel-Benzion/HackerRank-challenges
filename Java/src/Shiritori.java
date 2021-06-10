import java.util.*;
public class Shiritori
{
 public static List<String> theGame(List<String> words)
  {
    //Your Code Goes Here!
    List<String> list = new ArrayList<>();
   
   if (words.isEmpty() || words.size() == 1) return words;
   
   if (words.get(0).length() != 0 ) list.add(words.get(0));
   
   for (int i = 1; i < words.size(); i++) {
     String prev = words.get(i - 1);
     String current = words.get(i);
     if ((prev.length() == 0 && current.length() != 0) || (current.length() == 0 && prev.length() != 0)) {
       return list;
     }
     if (prev.length() == 0 && current.length() == 0) {
       continue;
     }
     if (prev.charAt(prev.length() - 1) == current.charAt(0)) {
       list.add(current);
     } else {
       break;
     }
     
   }
  return list;
  }

}