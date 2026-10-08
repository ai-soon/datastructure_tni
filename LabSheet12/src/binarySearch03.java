import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class binarySearch03 {

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

		int index = binarySearch(numsData, target);

		if (index != -1) {
			System.out.print("\nThe target (" + target + ") at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this tree");
		}

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
	
	public static int binarySearch(int [] num, int target) {
		int low = 0;
		int high = num.length-1;
		
		while (low <= high) {
			int middle = (high + low)/2;
			if (target == num[middle]) {
				return middle;
			}
			else if (target < num[middle]) {
				high = middle -1;
			}else {
				low = middle +1;
			}
		}
		return -1;
	}

}
