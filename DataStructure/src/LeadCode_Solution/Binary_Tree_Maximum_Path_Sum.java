package LeadCode_Solution;

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

	int max=Integer.MIN_VALUE;
	public Binary_Tree_Maximum_Path_Sum()
	{
		TreeNode root=new TreeNode(-5);
		root.left=new TreeNode(-1);
		root.right=new TreeNode(-6);
		root.left.left=new TreeNode(-3);
		System.out.println(maxPathSum(root));
	}
	public int maxPathSum(TreeNode root) {
        createMax(root);
        return max;
    }
    public int createMax(TreeNode root)
    {
    	if(root==null)
        {
            return 0;
        }
        int left=Math.max(createMax(root.left),0);
        int right=Math.max(createMax(root.right),0);
        max=Math.max(max,left+right+root.val);
        return root.val+Math.max(left,right);
    }
}
