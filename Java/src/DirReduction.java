import java.util.*;

public class DirReduction {
  
    public static boolean keepDir(String a, String b) {
      if (
        (a.equals("NORTH") && b.equals("SOUTH")) || 
        (a.equals("SOUTH") && b.equals("NORTH")) ||
        (a.equals("EAST") && b.equals("WEST")) ||
        (a.equals("WEST") && b.equals("EAST"))
      
      ) return false;
      return true;
    }
  
    public static String[] dirReduc(String[] arr) {
      
      if (arr.length <= 1) return arr;
      
      Queue<String> queue = new LinkedList<String>();

      List<String> list = new ArrayList<>();
      List<String> checker = new ArrayList<>();

      for (String str : arr) {
          queue.add(str);
      }
    
      
      while (true) {
        

        // for (int i = 0; i < arr.length; i += 2) {
        //     System.out.println(i);
        //     List<String> arrList = Arrays.asList(arr);
        //     System.out.println("Array: " + arrList);
        //     if (i == arr.length - 1) {
        //         list.add(arr[i]);
        //         break;
        //     }
        //   if (keepDir(arr[i], arr[i + 1])) {
        //     list.add(arr[i]);
        //     list.add(arr[i + 1]);
        //   }

          
        // }
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                list.add(queue.poll());
                break;
            }
            String a = queue.poll();
            String b = queue.poll();

            if (keepDir(a, b)) {
                list.add(a);
                list.add(b);
            }
        }
        

        if (list.equals(checker)) break;

        checker = List.copyOf(list);
        for (String str : list) {
            queue.add(str);
        }



        
        // if (list.size() == arr.length) {
        //   keepGoing = false;
        // } else {
        //   arr = new String[list.size()];
        //   arr = list.toArray(arr);
        //   list.clear();
        // }


      }
      
      
      
      arr = new String[list.size()];
      arr = list.toArray(arr);
      return arr;
    }

    public static void main(String[] args) {
        String[] input = new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.print("[");
        String[] result = dirReduc(input);
        for (String str : result) {
            System.out.println(str);
        }
    }
}
