package LeadCode_Solution;

public class Longest_Univalue_Path {
	public class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int val)
		{
			
		}
	}
	public Longest_Univalue_Path()
	{
		
	}
	int max=0;
    public int longestUnivaluePath(TreeNode root) {
        buildMax(root);
        return max;
    }
    public int buildMax(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=buildMax(root.left);
        int right=buildMax(root.right);
        int leftin=0,rightin=0;
        if(root.left!=null&&root.val==root.left.val)
        {
            leftin=left+1;
        }
        if(root.right!=null&&root.val==root.right.val)
        {
            rightin=right+1;
        }
        max=Math.max(max,(leftin+rightin));
        return Math.max(leftin,rightin);
    }
}
