package Algoritham.Tree.Week_3;

public class Binary_Tree_Maximum_Path_Sum {
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

	public Binary_Tree_Maximum_Path_Sum()
	{
		TreeNode root=new TreeNode(-5);
		root.left=new TreeNode(-1);
		root.right=new TreeNode(-6);
		root.left.left=new TreeNode(-3);
		System.out.println(maxPathSum(root));
	}
	int max=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {

		buldMaxPath(root);
		return max;
	}
	private int buldMaxPath(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int left=Math.max(buldMaxPath(root.left),0);
		int right=Math.max(buldMaxPath(root.right),0);
		max=Math.max(max,left+right+root.val);
		return (root.val+Math.max(left,right));
	}
}
