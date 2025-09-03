package LeadCode_Solution;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {
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
	public Binary_Tree_Postorder_Traversal()
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		System.out.println(postorderTraversal(root));
	}
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res=new LinkedList<Integer>();
		funPostOrderTraversal(root,res);
		return res;
	}
	public void funPostOrderTraversal(TreeNode root,List<Integer> res){
		if(root==null)
		{
			return;
		}
		funPostOrderTraversal(root.left, res);
		funPostOrderTraversal(root.right, res);
		res.add(root.val);
	}
}
