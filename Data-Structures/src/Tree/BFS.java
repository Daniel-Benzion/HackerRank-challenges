package Tree;

import java.util.*;

public class BFS {

	public static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.poll();

			System.out.print(temp.data + " ");

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if(temp.right != null) {
				queue.add(temp.right);
			}
		}

	}
}
