package Algoritham.Tree;

public class Kth_Smallest_Element_in_a_BST {
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
		public TreeNode(int val,TreeNode left,TreeNode right)
		{
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}
	public Kth_Smallest_Element_in_a_BST()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.left.left=null;
		root.left.right=new TreeNode(2);
		
		System.out.println(kthSmallest(root,1));

	}
	int count=0,result=0,valid=0;
	public int kthSmallest(TreeNode root, int k) {
		inOrder(root,k);
		return result;
	}
	public void inOrder(TreeNode root,int k)
	{
		if(root==null)
		{
			return;
		}
		if(valid==0)
		inOrder(root.left,k);
		count++;
		if(count==k)
		{
			result=root.val;
			valid=1;
		}
		if(valid==0)
		inOrder(root.right,k);
	}
}
