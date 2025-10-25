package LeadCode_Solution;

public class Path_Sum {
	
	public class TreeNode
	{
		int val;
		TreeNode right;
		TreeNode left;
		public TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	
	public Path_Sum()
	{
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		System.out.println(hasPathSum(root,9));
	}
	public boolean hasPathSum(TreeNode root, int targetSum)
	{
		if(root==null)
		{
			return false;
		}
		if(root.left==null&&root.right==null)
		{
			return root.val==targetSum;
		}
		return hasPathSum(root.left, targetSum-root.val) 
				||
				hasPathSum(root.right, targetSum-root.val); 
	}
}
