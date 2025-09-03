package LeadCode_Solution;

public class Invert_Binary_tree {

	private class TreeNode
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

	public Invert_Binary_tree()
	{
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(3);

	}

	public TreeNode invertTree(TreeNode root) {
		if(root==null)
		{
			return root;
		}
		invertTree(root.left);
		invertTree(root.right);
		
		TreeNode tamp=root.left;
		root.left=root.right;
		root.right=tamp;
		
		return root;
	}
}
