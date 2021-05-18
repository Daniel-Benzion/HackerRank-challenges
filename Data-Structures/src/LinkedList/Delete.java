package LinkedList;

public class Delete {

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

	public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
		if (llist == null || llist.next == null) return null;

		if (position == 0) {
			llist = llist.next;
			return llist;
		}

		int counter = 0;
		SinglyLinkedListNode current = llist;

		while (counter < position - 1) {
			current = current.next;
			counter++;
		}
		if (current.next == null) return llist;
		if (current.next.next == null) {
			current.next = null;
			return llist;
		}

		current.next = current.next.next;
		return llist;
	}
}
