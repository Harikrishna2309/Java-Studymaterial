package Data_structure;
class Node11{
	int item,height;
	Node11 left,right;
	
	Node11(int d){
		item=d;
		height=1;
	}
}

public class AVLtree {
	Node11 root;
	int height(Node11 N) {
		if(N==null)
			return 0;
		return N.height;
	}
	int max(int a,int b) {
		return(a>b)?a:b;
	}
	Node11 rightrotate(Node11 y) {
		Node11 x=y.left;
		Node11 t2=x.right;
		x.right=y;
		y.left=t2;
		y.height=max(height(y.left),height(y.right))+1;
		x.height=max(height(x.left),height(x.right))+1;
		return x;
		
	}
	Node11 leftrotate(Node11 x) {
		Node11 y=x.left;
		Node11 t2=y.right;
		y.left=x;
		x.right=t2;
		x.height=max(height(x.left),height(x.right))+1;
		y.height=max(height(y.left),height(y.right))+1;
		return y;
	}
	int getbalancefactor(Node11 N) {
		if(N==null)
			return 0;
		return height(N.left)-height(N.right);
	}
	Node11 insertnode(Node11 node,int item) {
		if(node==null)
			return(new Node11(item));
		if(item<node.item)
			node.left=insertnode(node.left,item);
		else if(item>node.item)
			node.right=insertnode(node.right,item);
		else
			return node;
		node.height=1+max(height(node.left),height(node.right));
		int balancefactor=getbalancefactor(node);
		if(balancefactor>1) {
			if(item<node.left.item) {
				return rightrotate(node);
			}
			else if(item>node.left.item) {
				node.left=leftrotate(node.left);
				return rightrotate(node);
				
			}
		}
		if(balancefactor<-1) {
			if(item>node.right.item) {
				return leftrotate(node);
			}
			else if(item<node.right.item) {
				node.right=rightrotate(node.right);
				return leftrotate(node);
			}
		}
		return node;
	}
	Node11 nodewithminimumvalue(Node11 node) {
		Node11 current=node;
		while(current.left!=null)
			current=current.left;
		return current;
	}
	Node11 deletenode(Node11 root,int item) {
		if(root==null)
			return root;
		if(item<root.item)
			root.left=deletenode(root.left,item);
		else if(item>root.item)
			root.right=deletenode(root.right,item);
		else {
			if((root.left==null)||(root.right==null)) {
				Node11 temp=null;
				if(temp==root.left)
					temp=root.right;
				else
					temp=root.left;
				if(temp==null) {
					temp=root;
					root=null;
				}else
					root=temp;
			}else {
				Node11 temp=nodewithminimumvalue(root.right);
				root.item=temp.item;
				root.right=deletenode(root.right,temp.item);
				
			}
		}
		if(root==null)
			return root;
		root.height=max(height(root.left),height(root.right))+1;
		int balancefactor=getbalancefactor(root);
		if(balancefactor>1) {
			if(getbalancefactor(root.left)>=0) {
				return rightrotate(root);
				
			}else {
				root.left=leftrotate(root.left);
				return rightrotate(root);
			}
		}
		if(balancefactor<-1) {
			if(getbalancefactor(root.right)<=0) {
				return leftrotate(root);
			}else {
				root.right=rightrotate(root.right);
				return leftrotate(root);
			}
		}
		return root;
	}
	void preorder(Node11 node) {
		if(node!=null) {
			System.out.print(node.item+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	private void printtree(Node11 currptr,String indent,boolean last) {
		if(currptr!=null) {
			System.out.print(indent);
			if(last) {
				System.out.print("r---- ");
				indent+=" ";
			}else {
				System.out.print("l---- ");
				indent+="| ";
			}
			System.out.println(currptr.item);
			printtree(currptr.left,indent,false);
			printtree(currptr.right,indent,true);
		}
	}

	public static void main(String[] args) {
		AVLtree tree=new AVLtree();
		tree.root=tree.insertnode(tree.root, 33);
		tree.root=tree.insertnode(tree.root, 13);
		tree.root=tree.insertnode(tree.root, 53);
		tree.root=tree.insertnode(tree.root, 9);
		tree.root=tree.insertnode(tree.root, 21);
		tree.root=tree.insertnode(tree.root, 61);
		tree.root=tree.insertnode(tree.root, 8);
		tree.root=tree.insertnode(tree.root, 11);
		tree.printtree(tree.root," ",true);
		tree.root=tree.deletenode(tree.root,13);
		System.out.println("after deleting: ");
		tree.printtree(tree.root, " ", true);

	}

}
