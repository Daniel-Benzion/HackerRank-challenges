package LinkedList;

public class Reverse {

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

	public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
		if (llist == null) return null;
		if (llist.next == null) return llist;

		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode current = llist;
		SinglyLinkedListNode next = null;

		while(current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current.next = prev;
		return current;
	}
}
