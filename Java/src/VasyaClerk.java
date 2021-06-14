public class VasyaClerk {

    public static String Tickets(int[] peopleInLine) {

        int $25 = 0;
        int $50 = 0;

        for (int bill : peopleInLine) {
            if (bill == 25) {
                $25++;
            } else if (bill == 50) {
                $25--;
                $50++;
            } else {
                if ($50 > 0) {
                    $50--;
                    $25--;
                } else {
                    $25 -= 3;
                }
            }
            if ($25 < 0)
                return "NO";
        }
        return "YES";
    }

}
