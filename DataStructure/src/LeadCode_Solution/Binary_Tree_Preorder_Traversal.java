package LeadCode_Solution;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {

	private class TreeNode{
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

	public Binary_Tree_Preorder_Traversal()
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		System.out.println(preorderTraversal(root));
	}
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> preOrder=new LinkedList<Integer>();
		funpreOrder(root,preOrder);
		return preOrder;
	}
	public void funpreOrder(TreeNode root,List<Integer> preOrder)
	{
		if(root==null)
		{
			return ;
		}
		preOrder.add(root.val);
		funpreOrder(root.left, preOrder);
		funpreOrder(root.right, preOrder);
	}
}
