package LeadCode_Solution;

public class Range_Sum_of_BST {
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
	public Range_Sum_of_BST()
	{
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(3);
		root.left.left.left=new TreeNode(1);
		root.left.right=new TreeNode(7);
		root.left.right.left=new TreeNode(6);

		root.right=new TreeNode(15);
		root.right.left=new TreeNode(13);
		root.right.right=new TreeNode(18);
		int low=5,high=13;
		System.out.println(rangeSumBST(root,low,high));
	}
	int sum=0;
	public int rangeSumBST(TreeNode root, int low, int high) {
		inorder(root,low,high);
		return sum;
	}
	private void inorder(TreeNode root, int low, int high) {
		if(root==null)
		{
			return ;
		}
		if(low<root.val)
		{
			inorder(root.left, low, high);
		}
		if(root.val>=low&&root.val<=high)
		{
			sum=sum+root.val;
		}
		if(root.val<high)
		{
			inorder(root.right, low, high);
		}
	}
}
