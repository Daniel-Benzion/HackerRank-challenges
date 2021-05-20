package Tree;

public class Insert {

	public static Node insert(Node root, int data) {
		if (root == null) return new Node(data);

		if (data < root.data) root.left = insert(root.left, data);

		if (data > root.data) root.right = insert(root.right, data);

		return root;
	}

	public static Node insertIteratively(Node root, int data) {
		if (root == null) return new Node(data);

		Node parent = null;
		Node current = root;

		while(current != null) {
			parent = current;
			if (data < current.data) {
				current = current.left;
			} else current = current.right;
		}
		if (data < parent.data) parent.left = new Node(data);
		else parent.right = new Node(data);
		return root;
	}
}
