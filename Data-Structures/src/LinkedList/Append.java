package LinkedList;

public class Append {

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

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

		if (head == null) return new SinglyLinkedListNode(data);
		if (head.next == null) {
			head.next = new SinglyLinkedListNode(data);
			return head;
		}

		SinglyLinkedListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new SinglyLinkedListNode(data);
		return head;
	}
}
