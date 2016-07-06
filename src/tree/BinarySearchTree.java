package tree;
/**
 * Insert element
 * Delete element
 * find an element
 * find max-element
 * find min-element*/

public class BinarySearchTree extends BinaryTree{

	//Recursive insert
	public static BinaryTreeNode insert(BinaryTreeNode root, int data){
		
		if (root==null){
			root = new BinaryTreeNode(null, null, data);
			return root;
		}
		
		else {
			 if(data<root.getData()){
				root.setLeft(insert(root.getLeft(),data)); 
			 }
			 else if (data>root.getData()){
				 root.setRight(insert(root.getRight(),data));
			 }
		}
		return root;
	}
}