package Algoritham.Tree;

public class BST {
	
	private class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		private TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	
	public BST()
	{
		TreeNode root=new TreeNode(8);
		
		root.left=new TreeNode(3);
		root.right=new TreeNode(10);
		
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(6);
		root.left.right.left=new TreeNode(4);
		root.left.right.right=new TreeNode(7);
		
		root.right.right=new TreeNode(14);
		root.right.right.left=new TreeNode(13);
		
		
		int key=9;
		
		TreeNode result=BSTSearch(root,key);
		if(result==null)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(result.val);
		}
		
	}
	private TreeNode BSTSearch(TreeNode root,int key)
	{
		if(root==null||root.val==key)
		{
			return root;
		}
		if(key<root.val)
		{
			return BSTSearch(root.left, key);
		}
		else
		{
			return BSTSearch(root.right, key);
		}
	}
}
