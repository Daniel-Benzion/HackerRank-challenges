package LinkedList;

public class Compare {

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

	static int length(SinglyLinkedListNode node) {
		if (node == null) return 0;
		SinglyLinkedListNode current = node;
		int counter = 0;
		while (current.next != null) {
			current = current.next;
			counter++;
		}
		return ++counter;
	}

	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		if (length(head1) != length(head2)) return false;

		SinglyLinkedListNode current1 = head1;
		SinglyLinkedListNode current2 = head2;

		while (current1.next != null) {
			if (current1.data != current2.data) return false;
			current1 = current1.next;
			current2 = current2.next;
		}
		if (current1.data != current2.data) return false;
		return true;
	}
}
