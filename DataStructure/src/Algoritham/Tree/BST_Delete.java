package Algoritham.Tree;

public class BST_Delete {

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

	public BST_Delete()
	{
		TreeNode root=new TreeNode(80);
		root.left=new TreeNode(70);
		root.right=new TreeNode(90);

		TreeNode result=deleteNode(root,70);
	}
	public TreeNode deleteNode(TreeNode root ,int key)
	{
		if(root==null)
		{
			return root;
		}
		if(key<root.val)
		{
			root.left=deleteNode(root.left,key);
		}
		if(key>root.val)
		{
			root.right=deleteNode(root.right,key);
		}
		else
		{
			// // Case 1 & 2: Node with 0 or 1 child
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}

			// Case 3: Node with 2 children
			root.val=minValue(root.right); //// inorder successor
			deleteNode(root.right,root.val);
		}
		return null;
	}
	public int minValue(TreeNode root)
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
