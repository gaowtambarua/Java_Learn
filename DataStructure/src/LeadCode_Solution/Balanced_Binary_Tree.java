package LeadCode_Solution;

public class Balanced_Binary_Tree {

	public class TreeNode{
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

	public Balanced_Binary_Tree()
	{
		TreeNode root=new TreeNode(1);

//		root.left=new TreeNode(2);
//		root.right=new TreeNode(3);
//
//		root.left.left=new TreeNode(5);
//		root.left.right=new TreeNode(6);
//		
//		root.right.left=new TreeNode(7);
//		root.right.right=new TreeNode(8);
//
//		root.left.right.left=new TreeNode(8);
//		root.left.right.right=new TreeNode(9);
		
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		
		System.out.println(isBalanced(root));

	}
	public boolean isBalanced(TreeNode root) {
		
		System.out.println(checkBalanced(root));
        return true;
    }
	private int checkBalanced(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int left=checkBalanced(root.left);
		int right=checkBalanced(root.right);
		if(left==-1||right==-1||Math.abs(left-right)>1)
		{
			return -1;
		}
		return Math.max(left,right)+1;
	}
//	public boolean isBalanced(TreeNode root) {
//		return treeCheck(root,0)!=-1;
//	}
//	private int treeCheck(TreeNode root, int n)
//	{
//		if(root==null)
//		{
//			return n;
//		}
//		int left=treeCheck(root.left,n);
//		int right=treeCheck(root.right,n);
//		if(left==-1||right==-1||Math.abs(left-right)>1)
//		{
//			return -1;
//		}
//		return Math.max(left,right)+1;
//	}
}
