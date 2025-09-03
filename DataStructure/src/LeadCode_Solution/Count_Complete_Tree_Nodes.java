package LeadCode_Solution;

public class Count_Complete_Tree_Nodes {
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
	public Count_Complete_Tree_Nodes()
	{
		TreeNode root=new TreeNode(1);
		System.out.println(countNodes(root));
	}
	public int countNodes(TreeNode root) {
		if(root==null)
		{
			return 0;
		}
		int left=countNodes(root.left);
		int right=countNodes(root.right);
		return (left+right)+1;
	}

}
