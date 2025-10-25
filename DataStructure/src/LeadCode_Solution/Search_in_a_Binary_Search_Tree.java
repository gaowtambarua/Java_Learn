package LeadCode_Solution;

public class Search_in_a_Binary_Search_Tree {
	private class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		private TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	public Search_in_a_Binary_Search_Tree()
	{
		TreeNode root=new TreeNode(8);

		root.left=new TreeNode(3);
		root.right=new TreeNode(10);

		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(6);
		root.left.right.left=new TreeNode(4);
		root.left.right.right=new TreeNode(7);

		root.right.right=new TreeNode(14);
		root.right.right.left=new TreeNode(13);


		int key=9;

		TreeNode result=searchBST(root,key);
		if(result==null)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(result.val);
		}
	}
	private TreeNode searchBST(TreeNode root,int val)
	{
		if(root==null||root.val==val)
		{
			return root;
		}
		if(val<root.val)
		{
			return searchBST(root.left, val);
		}
		else
		{
			return searchBST(root.right, val);
		}
	}
}
