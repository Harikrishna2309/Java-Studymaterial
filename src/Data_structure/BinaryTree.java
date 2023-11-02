package Data_structure;
class Node{
	int item;
	Node left,right;
	
	public Node(int key) {
		item=key;
		left=right=null;
	}
}

public class BinaryTree {
	Node root;
	BinaryTree()
	{
		root=null;
	}
	void postorder(Node node) {
		if (node== null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+">=");
	}
	void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.item+">=");
		inorder(node.right);
	}
	void preorder(Node node) {
		if(node==null) {
			return  ;
		}
		System.out.print(node.item+">=");
		preorder(node.left);
		preorder(node.right);
	}

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6); 
		System.out.println("inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);
		

	}

}
