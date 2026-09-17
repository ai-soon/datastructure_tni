
public class TreeApp3 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Delete leaf node");
		System.out.println("-------------------------------------------");
		int target = 25;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Delete 1 child node");
		System.out.println("-------------------------------------------");
		int target2 = 10;
		tree.delete(target2);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Delete 2 child node");
		System.out.println("-------------------------------------------");
		int target3 = 60;
		tree.delete(target3);
		tree.printTree(tree.getRoot(), 0);
		
	}

}
