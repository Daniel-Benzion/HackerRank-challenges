public class ReverseDLL {
    
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }


    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode temp = llist;
        DoublyLinkedListNode newHead = llist;
        while (temp != null) {
        DoublyLinkedListNode prev = temp.prev;
        temp.prev = temp.next;
        temp.next = prev;
        newHead = temp;
        temp = temp.prev;
        }
        return newHead;
    }
}
