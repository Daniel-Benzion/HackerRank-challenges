package Stack;

import java.util.*;

public class MaxElement {

	public static List<Integer> getMax(List<String> operations) {
		// Write your code here
		Stack<StackNode> stack = new Stack<>();

		int max = Integer.MIN_VALUE;

		for (String operation : operations) {
			if (operation.contains(" ")) {
				int current = Integer.parseInt(operation.substring(operation.indexOf(" ") + 1));
				max = Math.max(current, max);
				stack.push(new StackNode(current, max));
			} else if (operation.equals("2")) {

				if (!stack.isEmpty()) {
					stack.pop();
				}
				if (stack.isEmpty()) {
					max = Integer.MIN_VALUE;
				} else max = stack.peek().curMax;
			} else if (operation.equals("3")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.peek().curMax);
				}
			}
		}
		List<Integer> result = new ArrayList<>();
		for (StackNode sn : stack) {
			result.add(sn.val);
		}
		return result;
	}

	private static class StackNode {
		int val;
		int curMax;
		public StackNode(int val, int curMax) {
			this.val = val;
			this.curMax = curMax;
		}

		public String toString() {
			return val + " [" + curMax + "]";
		}
	}

	public static void main(String[] args) {

		List<String> operations = new ArrayList<>();
		operations.add("4");
		operations.add("1 83");
		operations.add("3");
		operations.add("2");
		operations.add("1 76");
		getMax(operations);
	}
}
