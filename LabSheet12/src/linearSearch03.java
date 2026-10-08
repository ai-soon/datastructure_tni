import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class linearSearch03 {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();
		tree.printTree(tree.getRoot(), 0);
		System.out.println("Treversal order : " + traversal(tree.getRoot()));

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nInput a target number: ");
		int target = input.nextInt();

		int[] numsData = new int[traversal(tree.getRoot()).size()];

		for (int i = 0; i < numsData.length; i++) {
			numsData[i] = traversal(tree.getRoot()).get(i);
		}

		int index = linearSearch(numsData, target);

		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this array");
		}
	}

	public static int linearSearch(int[] num, int target) {
		for (int i = 0; i <= num.length - 1; i++) {
			if (target == num[i]) {
				return i;
			}
		}
		return -1;
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (node != null) {
			Queue<Node> q = new ArrayDeque<Node>();
			q.add(node);
			while (!q.isEmpty()) {
				int levelsize = q.size();

				for (int i = 0; i < levelsize; i++) {
					Node current_node = q.poll();
					list.add(current_node.data);
					if (current_node.left != null) {
						q.add(current_node.left);
					}
					if (current_node.right != null) {
						q.add(current_node.right);
					}
				}

			}

		}
		return list;
	}
}
