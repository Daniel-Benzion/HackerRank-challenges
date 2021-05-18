package LinkedList;

public class ReversePrint {

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

	public static void reversePrint(SinglyLinkedListNode llist) {
		SinglyLinkedListNode current = reverse(llist);
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
}
