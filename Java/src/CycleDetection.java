import java.util.*;

public class CycleDetection {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;

        Set<SinglyLinkedListNode> set = new HashSet<>();

        while (true) {

            if (!set.add(current))
                return true;
            if (current.next == null)
                break;
            current = current.next;
        }
        return false;
    }
}