import java.util.Scanner;

public class TreeApp4 {
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------");
		System.out.println("Binary tree From CreateTree6()");
		System.out.println("----------------------------------");

		tree.createTree6();
		tree.printTree(tree.getRoot(), 0);

		System.out.println("----------------------------------");
		System.out.print("Input Number : ");
		int num = sc.nextInt();

		tree.searchDeleteNode(num);
		Node found = tree.getDeleteNode();

		if (found != null) {
			if (found.left != null) {
				System.out.println("Left Child " + found.left.data );
			}else {
				System.out.println("No left child");
			}
		}
		if (found.right != null) {
			System.out.println("Right child of " + found.right.data);
		} else {
			System.out.println("No Right child");
		}

		if (found.left == null && found.right == null) {
			System.out.println("[" + num + "] is Leaf node");
		} else {
			System.out.println("[" + num + "] is not Leaf node");
		}

	}
}
