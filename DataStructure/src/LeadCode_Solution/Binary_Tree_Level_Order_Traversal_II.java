package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_Level_Order_Traversal_II {
	private class TreeNode
	{
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

	public Binary_Tree_Level_Order_Traversal_II()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		//		root.left.left=new TreeNode(4);
		//		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		//root=null;

		//Using Collections Reverse Funcion
		System.out.println("Using Collections Reverse Funcion = "+levelOrder1(root));

		//Using Last In First Out DFS
		System.out.println("Using Last In First Out DFS = "+levelOrder2(root));
	}
	public List<List<Integer>> levelOrder2(TreeNode root) {

		LinkedList<List<Integer>> result=new LinkedList<>();
		if(root==null)
		{
			return result;
		}
		Queue<TreeNode> que=new LinkedList<TreeNode>();
		que.add(root);
		while(!que.isEmpty())
		{
			List<Integer> temp=new LinkedList<>();
			int size=que.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=que.poll();
				temp.add(current.val);
				if(current.left!=null)
				{
					que.add(current.left);
				}
				if(current.right!=null)
				{
					que.add(current.right);
				}
			}
			result.addFirst(temp);
		}
		return result;
	}
	public List<List<Integer>> levelOrder1(TreeNode root) {

		List<List<Integer>> result=new ArrayList<>();
		if(root==null)
		{
			return result;
		}
		Queue<TreeNode> que=new LinkedList<TreeNode>();
		que.add(root);
		while(!que.isEmpty())
		{
			List<Integer> temp=new LinkedList<>();
			int size=que.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=que.poll();
				temp.add(current.val);
				if(current.left!=null)
				{
					que.add(current.left);
				}
				if(current.right!=null)
				{
					que.add(current.right);
				}
			}
			result.add(temp);
		}
		Collections.reverse(result);
		return result;
	}
}
