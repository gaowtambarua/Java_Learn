package LeadCode_Solution;

public class Maximum_Depth_of_Binary_Tree {
	private class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val)
		{
			this.val=val;
			left=null;
			right=null;
		}
	}

	public Maximum_Depth_of_Binary_Tree()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(17);
		System.out.println(maxDepth(root));
	}

	public int maxDepth(TreeNode root) {
		if(root==null)
		{
			return 0;
		}
		int left=maxDepth(root.left)+1;
		int right=maxDepth(root.right)+1;
		
		return Math.max(left, right);
	}
}
