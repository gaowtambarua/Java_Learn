package LeadCode_Solution;

import java.util.LinkedList;
import java.util.List;


public class Binary_Tree_Inorder_Traversal {
	
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
	
	public Binary_Tree_Inorder_Traversal()
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		System.out.println(inorderTraversal(root));
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<Integer>();
        inorder(root,res);
        return res;
    }
	public void inorder(TreeNode root,List<Integer> res)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left,res);
		res.add(root.val);
		inorder(root.right,res);
	}
}
