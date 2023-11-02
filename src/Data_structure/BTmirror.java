package Data_structure;
class Node6{
	int data;
	Node6 left=null,right=null;
	Node6(int data){
		this.data=data;
	}
}
public class BTmirror {
	public static void preorder(Node6 root){
		if (root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void swap(Node6 root) { 
		if(root==null) {
			return;
		}
		Node6 temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	public static void convertTomirror(Node6 root) {
		if(root==null) {
			return;
		}
		convertTomirror(root.left);
		convertTomirror(root.right);
		swap(root);
	}

	public static void main(String[] args) {
		Node6 root=new Node6(1);
		root.left=new Node6(2);
		root.right=new Node6(3);
		root.left.left=new Node6(4);
		root.left.right=new Node6(5);
		root.right.left=new Node6(6);
		root.right.right=new Node6(7);
		preorder(root);
		System.out.println();
		convertTomirror(root);
		preorder(root);

	}

}
