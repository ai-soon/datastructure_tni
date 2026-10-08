import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class jumpSearch03 {

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

		int index = jumpSearch(numsData, target);

		if (index != -1) {
			System.out.print("\nThe target (" + target + ") at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this tree");
		}

	}
	
	public static int jumpSearch(int[] nums, int target) {
		int jump_size = (int) Math.floor(Math.sqrt(nums.length));

		int start = 0;
		int m = 0;

		while (m < nums.length) {
			if (nums[m] == target) {
				return m;
			} else if (nums[m] < target) {
				start = m;
				m += jump_size;
			} else {
				for (int i = start; i <= m; i++) {
					if (target == nums[i]) {
						return i;
					}
				}
				return -1;
			}
		}
		for (int i = start; i <= nums.length-1; i++) {
			if (target == nums[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();
		
		Node curr_node = node;
				
		while (curr_node != null || !stack.isEmpty()) {
			
			while (curr_node != null) {
				stack.push(curr_node);
				curr_node = curr_node.left;
			}
			curr_node = stack.pop();
			list.add(curr_node.data);
			curr_node = curr_node.right;
		}
		return list;
	}

}
