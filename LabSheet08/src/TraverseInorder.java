import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TraverseInorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Inorder = " + traversal(tree.getRoot()));
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