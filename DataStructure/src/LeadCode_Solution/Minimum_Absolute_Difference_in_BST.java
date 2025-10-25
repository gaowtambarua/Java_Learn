package LeadCode_Solution;

public class Minimum_Absolute_Difference_in_BST {

	private class TreeNode{
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

	public Minimum_Absolute_Difference_in_BST()
	{
		TreeNode root=new TreeNode(10);
//		root.left=new TreeNode(2);
//		root.right=new TreeNode(15);
		System.out.println(getMinimumDifference(root));
	}

	private int min=Integer.MAX_VALUE;
	private TreeNode prev=null;
	public int getMinimumDifference(TreeNode root) {
		funInorder(root);
		return min;
	}
	private void funInorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		funInorder(root.left);
		if(prev!=null)
		{
			min=Math.min(min,root.val-prev.val);
		}
		prev=root;
		funInorder(root.right);
	}
}
