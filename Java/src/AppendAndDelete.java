public class AppendAndDelete {

    static class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }
    }

    public static String appendAndDelete(String s, String t, int k) {

        if ((s.length() == 0 && t.length() <= k) || (t.length() == 0 && s.length() <= k)) {
            return "Yes";
        } else if ((s.length() == 0 && !(t.length() <= k)) || (t.length() == 0 && !(s.length() <= k)))
            return "No";

        if (s.length() + t.length() <= k)
            return "Yes";

        Node sNode = new Node(s.charAt(0));
        Node tNode = new Node(t.charAt(0));

        Node sCurrent = sNode;
        Node tCurrent = tNode;

        for (int i = 1; i < s.length(); i++) {
            sCurrent.next = new Node(s.charAt(i));
            sCurrent = sCurrent.next;
        }

        for (int j = 1; j < t.length(); j++) {
            tCurrent.next = new Node(t.charAt(j));
            tCurrent = tCurrent.next;
        }

        sCurrent = sNode;
        tCurrent = tNode;

        if (sCurrent.data != tCurrent.data) {
            int deleteCount = 0;
            int appendCount = 0;

            while (sCurrent != null) {
                deleteCount++;
                sCurrent = sCurrent.next;
            }

            while (tCurrent != null) {
                appendCount++;
                tCurrent = tCurrent.next;
            }
            if (deleteCount + appendCount <= k) {
                return "Yes";
            } else
                return "No";
        }
        while (true) {

            if (sCurrent == null && tCurrent == null)
                break;

            if (tCurrent == null) {
                int counter = 0;
                while (sCurrent != null) {
                    counter++;
                    sCurrent = sCurrent.next;
                }
                if (counter == k || (k - counter > 0 && (k - counter) % 2 == 0)) {
                    return "Yes";
                } else
                    return "No";
            }

            if (sCurrent == null) {
                int counter = 0;
                while (tCurrent != null) {
                    counter++;
                    tCurrent = tCurrent.next;
                }
                if (counter == k || (k - counter > 0 && (k - counter) % 2 == 0)) {
                    return "Yes";
                } else
                    return "No";
            }

            if (sCurrent.data != tCurrent.data) {
                int deleteCount = 0;
                int appendCount = 0;

                while (sCurrent != null) {
                    deleteCount++;
                    sCurrent = sCurrent.next;
                }

                while (tCurrent != null) {
                    appendCount++;
                    tCurrent = tCurrent.next;
                }
                if (deleteCount + appendCount == k
                        || (k - (deleteCount + appendCount) > 0 && (k - (deleteCount + appendCount)) % 2 == 0)) {
                    return "Yes";
                } else
                    return "No";
            }
            sCurrent = sCurrent.next;
            tCurrent = tCurrent.next;
        }
        return "Yes";
    }

}
