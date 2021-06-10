import java.util.*;

public class LisaWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {

        int result = 0;
        int page = 1;

        for (int i = 0; i < arr.size(); i++) {
            
            int problems = arr.get(i);

            for (int j = 1; j <= problems; j++) {

                if (j == page) result++;
                if ((j % k == 0) || j == problems) page++;
            }

        }

        return result;
    }

}
