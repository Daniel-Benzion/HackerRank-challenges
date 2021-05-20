package Tree;


import java.util.*;

public class TopView {

	static class QueueNode {
		Node node;
		int level;

		public QueueNode(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	public static void topView(Node root) {
		Queue<QueueNode> queue = new LinkedList<QueueNode>();

		TreeMap<Integer, Integer> map = new TreeMap<>();

		queue.add(new QueueNode(root, 0));

		while(!queue.isEmpty()) {

			QueueNode qn = queue.poll();
			if (!map.containsKey(qn.level)) {
				map.put(qn.level, qn.node.data);
			}


			if (qn.node.left != null) {
				queue.add(new QueueNode(qn.node.left, qn.level - 1));
			}

			if (qn.node.right != null) {
				queue.add(new QueueNode(qn.node.right, qn.level + 1));
			}

		}

		for (Integer val : map.values()) {
			System.out.print(val + " ");
		}
	}



}
