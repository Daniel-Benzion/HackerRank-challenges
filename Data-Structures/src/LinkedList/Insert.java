package LinkedList;

public class Insert {

	static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;

		public SinglyLinkedListNode() {}

		public SinglyLinkedListNode(int data) {
			this.data = data;
		}

		public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
			this.data = data;
			this.next = next;
		}
	}

	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
		// Write your code here
		if (llist == null) return new SinglyLinkedListNode(data);
		int counter = 0;
		SinglyLinkedListNode current = llist;
		while (counter < position - 1) {
			current = current.next;
			counter++;
		}
		if (current.next == null) {
			current.next = new SinglyLinkedListNode(data);
			return llist;
		}
		SinglyLinkedListNode nxt = current.next;
		current.next = new SinglyLinkedListNode(data);
		current.next.next = nxt;
		return llist;
	}
}
