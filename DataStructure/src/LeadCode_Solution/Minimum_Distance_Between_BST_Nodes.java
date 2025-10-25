package LeadCode_Solution;

public class Minimum_Distance_Between_BST_Nodes {

	public class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}

	public Minimum_Distance_Between_BST_Nodes()
	{
		TreeNode root =new TreeNode(1);
		root.left=new TreeNode(0);
		root.right=new TreeNode(48);
		root.right.left=new TreeNode(12);
		root.right.right=new TreeNode(49);
		
		System.out.println(minDiffInBST(root));
	}
	int pre=-1,min=Integer.MAX_VALUE;
	public int minDiffInBST(TreeNode root) {
		
		inorder(root);
		return min;
	}
	public void inorder(TreeNode root)
	{
		if(root==null)
		{
			return ;
		}
		minDiffInBST(root.left);
		if(pre!=-1)
		{
            min=Math.min(min, root.val-pre);
		}
		pre=root.val;
		minDiffInBST(root.right);
	}
}
