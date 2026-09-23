
public class BSTApp1 {
	public static void main(String[] args) {
		//Display sampleTree1()
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.print("\nMinimum node is " + tree.findMinimum(tree.getRoot()
				).data);
		
		System.out.println("\nMaximum node is " + tree.findMaximum(tree.getRoot()).data);
		
		int findnum = 15;
		System.out.println("Is " + findnum + " in BST => " + tree.findSpecificData(findnum));
		
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent = " + tree.getParent().data);
		System.out.println("Delete node = " + tree.getDeleteNode().data);
		System.out.println();
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
		
		
		
	}
}
