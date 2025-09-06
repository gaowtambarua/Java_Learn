package Algoritham.Tree;

import java.util.LinkedList;
import java.util.List;

public class Recursive_Traversals {
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

	public Recursive_Traversals()
	{
		
		///////////////   Inorder / Preorder / Postorder → DFS nature → Stack (LIFO) // Last In Fast Out
		//////////////    Level Order → BFS nature → Queue (FIFO) /////// First in First Out
		
		
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		
		List<Integer> dfspreres=new LinkedList<Integer>();
		// Root → Left → Right
		dfspreorder(root, dfspreres);
		System.out.println("For DFS preorder = "+dfspreres);
		
		// Left → Root → Right
		List<Integer> dfsInorderres=new LinkedList<Integer>();
		dfsinorder(root,dfsInorderres);
		System.out.println("For DFS inorder ="+dfsInorderres);
		
		// Left → Right → Root
		List<Integer> dfsPostorder=new LinkedList<Integer>();
		dfspostorder(root,dfsPostorder);
		System.out.println("For DFS postorder ="+dfsPostorder);
		
	}
	public void dfspreorder(TreeNode root, List<Integer> res) {
		if(root==null)
		{
			return;
		}
		res.add(root.val);
		dfspreorder(root.left, res);
		dfspreorder(root.right, res);
	}
	public void dfsinorder(TreeNode root,List<Integer> res)
	{
		if(root==null)
		{
			return ;
		}
		dfsinorder(root.left, res);
		res.add(root.val);
		dfsinorder(root.right, res);
	}
	public void dfspostorder(TreeNode root,List<Integer> dfsPostorder)
	{
		if(root==null)
		{
			return;
		}
		dfspostorder(root.left, dfsPostorder);
		dfspostorder(root.right, dfsPostorder);
		dfsPostorder.add(root.val);
	}
}
