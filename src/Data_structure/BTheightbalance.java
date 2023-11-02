package Data_structure;

class Node5{
	int data;
	Node5 left,right;
	Node5(int d){
		data=d;
		left=right=null;
	}
}
class Height{
	int height=0;
}
public class BTheightbalance {
	Node5 root;
	public BTheightbalance() {
		root=null;
	}
	boolean checkHeightBalance(Node5 root,Height height) {
		if(root==null) {
			height.height=0;
			return true;
		}
		Height leftHeighteight=new Height(),rightHeighteight=new Height();
		boolean l=checkHeightBalance(root.left,leftHeighteight);
		boolean r=checkHeightBalance(root.right,rightHeighteight);
		int leftHeight=leftHeighteight.height,rightHeight=rightHeighteight.height;
		height.height=(leftHeight>rightHeight?leftHeight:rightHeight)+1;
		if((leftHeight-rightHeight>=2)||(rightHeight-leftHeight>=2))
			return false;
		else
			return l && r;
	}
	public static void main(String[] args) {
		Height height=new Height();
		BTheightbalance tree=new BTheightbalance();
		tree.root=new Node5(1);
		tree.root.left=new Node5(2);
		tree.root.right=new Node5(3);
		tree.root.left.left=new Node5(4);
		tree.root.left.right=new Node5(5);
		
		if(tree.checkHeightBalance(tree.root, height))
			System.out.println("the tree is balance ");
		else
			System.out.println("the tree is unbalanced");
		

	}

}
