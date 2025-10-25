package LeadCode_Solution;

public class Insert_into_a_Binary_Search_Tree {

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public Insert_into_a_Binary_Search_Tree()
	{
		TreeNode left=new TreeNode(0,null,null);
		TreeNode right=new TreeNode(3,null,null);
		left=new TreeNode(1,left,right);
		right=new TreeNode(7,null,null);
		TreeNode root=new TreeNode(4, left, right);
		
		int val=2;
		
		System.out.println(insertIntoBST(root, val));

	}

	public TreeNode insertIntoBST(TreeNode root, int val) {
		
		if(root==null)
		{
			return new TreeNode(val,null,null);
		}
		TreeNode left=null,right=null;
		if(val<root.val)
		{
			left=insertIntoBST(root.left,val);
			root.left=left;
		}
		else
		{
			right=insertIntoBST(root.right,val);
			root.right=right;
		}
		return root;
	}
}
