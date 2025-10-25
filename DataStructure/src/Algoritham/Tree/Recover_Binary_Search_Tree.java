package Algoritham.Tree;

public class Recover_Binary_Search_Tree {

	public class TreeNode{
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
	public Recover_Binary_Search_Tree()
	{
//		TreeNode root=new TreeNode(3);
//		root.left=new TreeNode(1);
//		root.right=new TreeNode(4);
//		root.right.left=new TreeNode(2);
		
//		TreeNode root=new TreeNode(1);
//		root.left=new TreeNode(3);
//		root.left.right=new TreeNode(2);
//		inOrder2(root);
//	    recoverTree(root);
//	    System.out.println("");
//	    inOrder2(root);
		
		
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.right.left=new TreeNode(2);
		inOrder2(root);
	    recoverTree(root);
	    System.out.println("");
	    inOrder2(root);
	}
//	TreeNode pre=null,first=null,second=null;
//	public void recoverTree(TreeNode root) {
//		inOrder(root);
//		int temp=first.val;
//		first.val=second.val;
//		second.val=temp;
//	}
//	public void inOrder(TreeNode root)
//	{
//		if(root==null)
//		{
//			return ;
//		}
//		inOrder(root.left);
//		if(pre!=null)
//		{
//			if(pre.val>root.val)
//			{
//				second=root;
//				if(first==null)
//				{
//					first=pre;
//				}
//			}
//		}
//		pre=root;
//		inOrder(root.right);
//	}
	
	
	
	
	
	
	TreeNode dummy=null,pre=null;
	public void recoverTree(TreeNode root) {
		dummy=root;
		inOrder(root);
	}
	public void inOrder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		inOrder(root.left);
		
		if(pre!=null)
		{
			if(pre.val>root.val)
			{
				int temp=pre.val;
				pre.val=root.val;
				root.val=temp;
				inOrder(dummy);
			}
		}
		pre=root;
		inOrder(root.right);
	}
		
	public void inOrder2(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		inOrder2(root.left);
		System.out.println(root.val);
		inOrder2(root.right);
	}
	
}
