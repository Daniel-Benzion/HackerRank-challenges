package LinkedList;

public class Prepend {

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

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		if (llist == null) return new SinglyLinkedListNode(data);
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		newNode.next = llist;
		return newNode;
	}

}
