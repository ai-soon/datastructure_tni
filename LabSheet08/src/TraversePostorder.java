import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class TraversePostorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();
		Queue<Integer> queue = new ArrayDeque<Integer>();

		stack.push(node);
		
		while (!stack.isEmpty()) {
			Node curr_node = stack.pop();
			queue.add(curr_node.data);
			
			if (curr_node.left != null) {
				stack.push(curr_node.left);
			}
			
			if(curr_node.right != null) {
				stack.push(curr_node.right);
			}
			while(!queue.isEmpty()) {
				int data =queue.poll();
				list.addFirst(data);
				
			}
		}
		return list;
	}
}