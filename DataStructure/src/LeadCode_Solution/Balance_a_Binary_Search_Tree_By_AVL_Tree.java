package LeadCode_Solution;
import java.util.*;
public class Balance_a_Binary_Search_Tree_By_AVL_Tree {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	
	
	/////////////////////////////////// For AVL Tree
	
	List<Integer> list=new ArrayList<Integer>();
	
	private class AVLNode{
		
		int val;
		AVLNode left;
		AVLNode right;
		int hight;
		public AVLNode(int val)
		{
			this.val=val;
			this.hight=1;
			this.left=null;
			this.right=null;
		}
	}

	public TreeNode balanceBST(TreeNode root) {
		inorder(root);
		AVLNode node=null;
		for(int val : list)
		{
			node=insert(node,val);
		}
		return convert(node);
	}
	private TreeNode convert(AVLNode node)
	{
		if(node==null)
		{
			return null;
		}
		TreeNode root=new TreeNode(node.val);
		root.left=convert(node.left);
		root.right=convert(node.right);
		return root;
	}
	private AVLNode insert(AVLNode root,int val)
	{
		if(root==null)
		{
			return new AVLNode(val);
		}
		else if(val<root.val)
		{
			root.left=insert(root.left,val);
		}
		else
		{
			root.right=insert(root.right,val);
		}
		updateHight(root);
		
		int balance=getBalance(root);
		
		if(balance>1&&root.left.val>val)
		{
			return rightRotate(root);
		}
		if(balance>1&&root.left.val<val)
		{
			root.left=leftRotate(root.left);
			return rightRotate(root);
		}
		
		
		if(balance<-1&&root.right.val<val)
		{
			return leftRotate(root);
		}
		
		if(balance<-1&&root.right.val>val)
		{
			root.right=rightRotate(root.right);
			return leftRotate(root);
		}
		
		return root;
	}
	private AVLNode rightRotate(AVLNode y)
	{
		AVLNode x=y.left;
		AVLNode t2=x.right;
		x.right=y;
		y.left=t2;
		updateHight(y);
		updateHight(x);
		return x;
	}
	
	private AVLNode leftRotate(AVLNode x)
	{
		AVLNode y=x.right;
		AVLNode t2=y.left;
		y.left=x;
		x.right=t2;
		updateHight(x);
		updateHight(y);
		return y;
	}
	
	private int getBalance(AVLNode root)
	{
		return height(root.left)-height(root.right);
	}
	
	
	
	
	private void updateHight(AVLNode root)
	{
		root.hight=1+Math.max(height(root.left),height(root.right));
	}
	private int height(AVLNode root)
	{
		return root==null?0:root.hight;
	}
	
	
	
	private void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}



	
	
	
	
	
	
	
	
	//////////////////////////////Main Call
	public Balance_a_Binary_Search_Tree_By_AVL_Tree()
	{
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.right=new TreeNode(3);
		root.right.right.right=new TreeNode(4);
		root=balanceBST(root);
	}
}
