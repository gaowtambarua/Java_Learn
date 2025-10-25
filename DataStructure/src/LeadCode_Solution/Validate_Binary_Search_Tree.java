package LeadCode_Solution;

public class Validate_Binary_Search_Tree {
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
	public Validate_Binary_Search_Tree()
	{
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.right.left=new TreeNode(3);
		root.right.right=new TreeNode(6);
		System.out.println(isValidBST(root));
	}
	Boolean valid=true;
	long pre=Long.MAX_VALUE;
	public boolean isValidBST(TreeNode root) {
		if(root==null)
		{
			return valid;
		}
		if(valid)
		{
			isValidBST(root.right);
		}
		if(root.val>=pre)
		{
			valid=false;
		}
		pre=root.val;
		if(valid)
		{
			isValidBST(root.left);
		}
		return valid;
	}
}
