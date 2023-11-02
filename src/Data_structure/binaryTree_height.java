package Data_structure;

public class binaryTree_height {
	 
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public Node root;
	public binaryTree_height() {
		root=null;
	}
	public  int findheight(Node temp) {
	
		if (root==null) {
			System.err.println("tree is empty");
			return 0;
		}
		else {
			int leftheight=0,rightheight=0;
			if(temp.left!=null) {
				leftheight=findheight(temp.left);
			}if(temp.right!=null) {
				rightheight=findheight(temp.right);
			}int max=(leftheight>rightheight)?leftheight:rightheight;
			return(max+1);
		}
	}

	public static void main(String[] args) {
		binaryTree_height bt=new binaryTree_height();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.right=new Node(6);
		bt.root.left.left.left=new Node(7);
		bt.root.left.left.right=new Node(8);
		bt.root.left.left.left.left=new Node(9);
		bt.root.right.right.left=new Node(10);
		bt.root.right.right.left.left=new Node(12);
		bt.root.right.right.left.right=new Node(13);
		System.out.println("maximum height of given binary tree  "+bt.findheight(bt.root));

	}

}
