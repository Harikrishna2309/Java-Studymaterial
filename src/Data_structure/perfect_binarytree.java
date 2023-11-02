package Data_structure;

public class perfect_binarytree {
	Node root;
	static class Node{
		int key;
		Node left,right;
	}
	static int depth(Node node) {
		int d=0;
		while(node !=null) {
			d++;
			node=node.left;
		}
		return d;
	}
	static boolean isperfect(Node root,int d,int level) {
		if(root==null) {
			return true;
		}
		if(root.left==null && root.right==null) {
			return(d==level+1);
		}
		if(root.left==null || root.right==null) {
			return false;
		}
		return isperfect(root.left,d,level+1) && isperfect(root.right,d,level+1);
	}
	static boolean isperfect(Node root) {
		int d=depth(root);
		return isperfect(root,d,0);
	}
	static Node newnode(int k) {
		Node node=new Node();
		node.key=k;
		node.right=null;
		node.left=null;
		return node;
	}

	public static void main(String[] args) {
		Node root=null;
		root=newnode(1);
		root.left=newnode(2);
		root.right=newnode(3);
		root.left.left=newnode(4);
		root.left.right=newnode(5);
		if(isperfect(root)==true) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not");
		}
		

	}

}
