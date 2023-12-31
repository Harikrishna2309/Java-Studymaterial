package Data_structure;
class Node3{
	int data;
	Node left,right;
	Node3(int item){
		data=item;
		left=right=null;
	}
}
public class full_binarytree {
	Node root;
	boolean isfullbinarytree(Node node) {
		if (node==null) {
			return true;
		}
		if(node.left==null && node.right==null) {
			return true;
		}
		if(node.left!=null && node.right!=null) {
			return(isfullbinarytree(node.left) && isfullbinarytree(node.right));
		}
		return false;
	}

	public static void main(String[] args) {
		full_binarytree tree=new full_binarytree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.left.left=new Node(6);
		tree.root.left.left.right=new Node(7);
		tree.root.left.right.left=new Node(8);
		tree.root.left.right.right=new Node(9);
		tree.root.right.left=new Node(10);
		tree.root.right.right=new Node(11);
		tree.root.right.right.left=new Node(12);
		if(tree.isfullbinarytree(tree.root)) {
			System.out.println("tree is full binary ");
		}else {
			System.out.println("tree is not a full binary tree");
		}
		
	}

}
