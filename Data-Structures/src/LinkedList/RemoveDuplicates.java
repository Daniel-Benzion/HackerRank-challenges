public class RemoveDuplicates {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }


    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
 
        if (llist.next == null) return llist;
        
        SinglyLinkedListNode temp = llist;
 
        while(temp.next != null) {
             if (temp.data == temp.next.data) temp.next = temp.next.next;
             else temp = temp.next;
        } 
        return llist;
    }
}
