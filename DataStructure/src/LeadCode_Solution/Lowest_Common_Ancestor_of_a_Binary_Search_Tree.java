package LeadCode_Solution;



public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
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
	
	public Lowest_Common_Ancestor_of_a_Binary_Search_Tree()
	{
		TreeNode root=new TreeNode(6);
		
		root.left=new TreeNode(2);
		root.right=new TreeNode(8);
		
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(4);
		root.left.right.left=new TreeNode(3);
		root.left.right.right=new TreeNode(5);
		
		root.right.left=new TreeNode(7);
		root.right.right=new TreeNode(9);
		
		TreeNode p=new TreeNode(3),q=new TreeNode(9);
		System.out.println(lowestCommonAncestor(root,p,q).val);
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root!=null&&p.val<root.val&&q.val<root.val)
		{
			return lowestCommonAncestor(root.left,p,q);
		}
		else if(root!=null&&p.val>root.val&&q.val>root.val) 
		{
			return lowestCommonAncestor(root.right,p,q);
		}
		else
		{
			return root;
		}
	}
}


