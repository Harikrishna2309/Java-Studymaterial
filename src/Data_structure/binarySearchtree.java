package Data_structure;

public class binarySearchtree {
	class node{
		int key;
		node left,right;
		public node(int item) {
			key=item;
			left=right=null;
			
		}
	}
	node root;
	binarySearchtree(){
		root=null;
		
	}
	void insert(int key) {
		root=insertkey(root,key);
		
	}
	node insertkey(node root,int key) {
		if (root==null) {
			root=new node(key);
			return root;
			
		}
		if(key<root.key) 
			root.left=insertkey(root.left,key);
		else if(key>root.key)
			root.right=insertkey(root.right,key);
		
			return root;
			
	}
	void inorder() {
		inorderrec(root);
		
	}void inorderrec(node root){
		if(root!=null) {
			inorderrec(root.left);
			System.out.print(root.key+" ");
			inorderrec(root.right);
		}
	}
	void deletekey(int key) {
		root=deleterec(root,key);
	}
	node deleterec(node root,int key) {
		if(root==null) {
			return root;
		}
		if(key<root.key)
			root.left=deleterec(root.left,key);
		else if(key>root.key)
			root.right=deleterec(root.right,key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.key=minvalue(root.right);
			root.right=deleterec(root.right,root.key);
		}
		return root;
	}
	int minvalue(node root) {
		int minv=root.key;
		while(root.left!=null) {
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	boolean search(int key) {
		return searchnode(root,key);
	}
	boolean searchnode(node root,int search) {
		if(root==null)
			return false;
		else if(root.key==search)
			return true;
		else if(search<root.key)
			return  searchnode(root.left,search);
		else if(search>root.key)
			return searchnode(root.right,search);
		return false;
		
	}
	

	public static void main(String[] args) {
		 binarySearchtree tree=new binarySearchtree();
		 tree.insert(8);
		 tree.insert(3);
		 tree.insert(1);
		 tree.insert(6);
		 tree.insert(7);
		 tree.insert(10);
		 tree.insert(14);
		 System.out.println("inorder traversal: ");
		 tree.inorder();
		 tree.deletekey(10);
		 System.out.println("\n\ninorder traversal after deleting: ");
		 tree.inorder();
		 System.out.println();
	     if(tree.search(3))
	    	 System.out.println("Element is present");
	     else
	    	 System.out.println("Element is not present");
	}

}
