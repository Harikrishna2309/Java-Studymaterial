package Data_structure;
class Node22{
	int item;
	Node22 left,right;
	
	public Node22(int key) {
		item=key;
		left=right=null;
	}
}
public class binary_treeEg2 {
	Node22 root;
	binary_treeEg2()
	{
		root=null;
	}
	void postorder(Node22 node) {
		if (node== null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+",");
	}
	void inorder(Node22 node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.item+",");
		inorder(node.right);
	}
	void preorder(Node22 node) {
		if(node==null) {
			return  ;
		}
		System.out.print(node.item+",");
		preorder(node.left);
		preorder(node.right);
	}

	public static void main(String[] args) {
		binary_treeEg2 tree=new binary_treeEg2();
		tree.root=new Node22(1);
		tree.root.left=new Node22(2);
		tree.root.left.left=new Node22(4);
		tree.root.left.right=new Node22(5);
		tree.root.right=new Node22(3);
		tree.root.right.left=new Node22(6);
		System.out.println("inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);

	}

}
