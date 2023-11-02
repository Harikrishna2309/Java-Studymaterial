package Data_structure;

import java.util.Scanner;
public class minimumBST {
	class node{
		int key;
		node left,right;
		public node(int item) {
			key=item;
			left=right=null;
			
		}
	}
	node root;
	minimumBST(){
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
		void preorder() {
			preorderrec(root);
		}void preorderrec(node root){
			if(root!=null) {
				System.out.print(root.key+" ");
				preorderrec(root.left);
				preorderrec(root.right);
			}
		}
		void postorder() {
			postorderrec(root);
		}void postorderrec(node root){
			if(root!=null) {
				postorderrec(root.left);
				postorderrec(root.right);
				System.out.print(root.key+" ");
			}
		}
		void minvalue() {
			minvaluerec(root);}
		void minvaluerec(node root) {
			int minv=root.key;
			while(root.left!=null) {
				minv=root.left.key;
				root=root.left;
			}
			System.out.println("\nminimum value of the tree is: "+ minv);
			
		}
			
	
	public static void main(String[] args) {
		minimumBST tree= new minimumBST();
		/*tree.insert(56);
		tree.insert(23);
		tree.insert(80);
		tree.insert(12);
		tree.insert(234);
		tree.insert(546);
		tree.insert(6);
		tree.insert(32);
		tree.inorder();
		System.out.println();
		tree.preorder();
		System.out.println();
		tree.postorder();*/
		Scanner s1= new Scanner(System.in);
		int count=1;
		Functions:
			for(int i=0;i<count;i++) {
				System.out.println("Enter integer element to insert:");
				tree.insert(s1.nextInt());
				
				System.out.print("Post Order:");
				tree.postorder();
				System.out.println();
				
				System.out.print("Pre Order:");
				tree.preorder();
				System.out.println();
				
				System.out.print("In Order:");
				tree.inorder();
				System.out.println();
				
				System.out.println("Do you want to continue (Type y or n)?");
				char c=s1.next().charAt(0);
				if(c=='y') {
					count++;
					continue Functions;
				}
				else if(c=='n')
					tree.minvalue();
			}
		
		
	  }	
		
	}
		
