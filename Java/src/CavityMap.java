import java.util.*;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {

        int length = grid.size();

        List<String> grid2 = new ArrayList<>(grid);

        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int current = Integer.parseInt((grid.get(i)).substring(j, j + 1));

                try {
                    int above = Integer.parseInt((grid.get(i - 1)).substring(j, j + 1));
                    int below = Integer.parseInt((grid.get(i + 1)).substring(j, j + 1));
                    int left = Integer.parseInt((grid.get(i)).substring(j - 1, j));
                    int right = Integer.parseInt((grid.get(i)).substring(j + 1, j + 2));

                    if (current > above && current > below && current > left && current > right)
                        sb.append('X');
                    else
                        sb.append((grid.get(i)).charAt(j));
                } catch (Exception e) {
                    sb.append((grid.get(i)).charAt(j));
                }
            }
            grid2.set(i, sb.toString());
        }
        return grid2;
    }

}
