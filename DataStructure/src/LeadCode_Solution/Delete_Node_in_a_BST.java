package LeadCode_Solution;

public class Delete_Node_in_a_BST {
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
		public TreeNode(int val,TreeNode left,TreeNode right)
		{
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}



	public Delete_Node_in_a_BST()
	{
		TreeNode left=new TreeNode(2,null,null);
		TreeNode right=new TreeNode(4,null,null);
		left=new TreeNode(3,left,right);

		right=new TreeNode(7,null,null);
		right=new TreeNode(6,null,right);

		TreeNode root=new TreeNode(5,left,right);

		root=deleteNode(root,3);
	}

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root==null)
		{
			return root;
		}
		if(key<root.val)
		{
			root.left=deleteNode(root.left,key);
		}
		else if(key>root.val)
		{
			root.right=deleteNode(root.right,key);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
			root.val=minVal(root.right);
			root.right=deleteNode(root.right,root.val);
		}
		
		
		return root;
	}
	public int minVal(TreeNode root)
	{
		int min=root.val;
		while(root.left!=null)
		{
			root=root.left;
			min=root.val;
		}
		return min;
	}
}
