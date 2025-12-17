package Algoritham.Tree.Week_6;

import java.util.ArrayList;
import java.util.List;

public class Balance_a_Binary_Search_Tree {
	public class TreeNode
	{
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

	List<Integer> list=new ArrayList<Integer>();
	public TreeNode balanceBST(TreeNode root) {
		inorder(root);
		return buildBalanceBST(0,list.size()-1);
	}
	public TreeNode buildBalanceBST(int left,int right)
	{
		if(left>right)
		{
			return null;
		}
		
		int mid=left+(right-left)/2;
		
		TreeNode root=new TreeNode(list.get(mid));
		root.left=buildBalanceBST(left,mid-1);
		root.right=buildBalanceBST(mid+1,right);
		
		return root;
	}
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}
	
	public Balance_a_Binary_Search_Tree()
	{
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.right=new TreeNode(3);
		root.right.right.right=new TreeNode(4);
		root=balanceBST(root);
		System.out.println(root.right.right.val);
	}
}
