package Algoritham.Tree;

public class IsValidBST {

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

	public IsValidBST()
	{
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(9);
		root.left.left=new TreeNode(8);
		root.left.left.left=new TreeNode(7);
		root.left.left.left.left=new TreeNode(6);
		root.right=new TreeNode(11);
		root.right.right=new TreeNode(12);
		root.right.right.right=new TreeNode(13);

		System.out.println();
		
		System.out.println(isValidBST(root));
	}

	public boolean isValidBST(TreeNode root) {
		
		return isValidcheck(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}
	public boolean isValidcheck(TreeNode root,long  min,long  max)
	{
		if(root==null)
		{
			return true;
		}
		else if(min>=root.val||root.val>=max)
		{
			return false;
		}
		return isValidcheck(root.left,min,root.val)
				&&
			   isValidcheck(root.right,root.val,max);
	}
}
