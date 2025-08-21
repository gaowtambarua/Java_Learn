package Algoritham.Tree;


public class DFS_Breadth_First_Search_Iterative_with_Queue {


	private class TreeNode{
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
	
	public DFS_Breadth_First_Search_Iterative_with_Queue()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		System.out.println(maxDepth(root));
	}
	
	public int maxDepth(TreeNode root) {
        if(root==null)
		{
			return 0;
		}
		int left=maxDepth(root.left)+1;
		int right=maxDepth(root.right)+1;
		
		return Math.max(left, right);
    }

}
