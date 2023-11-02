package Data_structure;
import java.util.concurrent.atomic.AtomicInteger;
class Node7{
	int data;
	Node7 left=null,right=null;
	Node7(int data){
		this.data=data;
		
	}
}
public class Btdiameter {
	public static int getdiameter(Node7 root,AtomicInteger diameter) {
		if (root==null) {
			return 0;
		}
		int left_height=getdiameter(root.left,diameter);
		int right_height=getdiameter(root.right,diameter);
		int max_diameter=left_height+right_height+1;
		diameter.set(Math.max(diameter.get(), max_diameter));
		return Math.max(left_height, right_height)+1;
	}
	public static int getdiameter(Node7 root) {
		AtomicInteger diameter=new AtomicInteger(0);
		getdiameter(root,diameter);
		return diameter.get();
		}

	public static void main(String[] args) {
		Node7 root=new Node7(1);
		root.left=new Node7(2);
		root.right=new Node7(3);
		root.left.right=new Node7(4);
		root.right.left=new Node7(5);
		root.right.right=new Node7(6);
		root.right.left.left=new Node7(7);
		root.right.left.right=new Node7(8);
		System.out.println("diameter of the tree is "+getdiameter(root));

	}

}
