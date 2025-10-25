package Algoritham.Tree;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
	
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
	
	public Lowest_Common_Ancestor_of_a_Binary_Tree()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(5);
		root.right=new TreeNode(1);
		
		root.left.left=new TreeNode(6);
		root.left.right=new TreeNode(2);
		root.left.right.left=new TreeNode(7);
		root.left.right.right=new TreeNode(4);
		
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(8);
		
		
		 TreeNode p=new TreeNode(5);
		 TreeNode q=new TreeNode(4);
		
		
		System.out.println(lowestCommonAncestor(root,p,q).val);
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null||root.val==p.val||root.val==q.val)
		{
			return root;
		}
		TreeNode left=lowestCommonAncestor(root.left, p, q);
		TreeNode right=lowestCommonAncestor(root.right, p, q);
		
		if(left!=null&&right!=null)
		{
			return root;
		}
		
		return left==null?right:left;
	}
}
