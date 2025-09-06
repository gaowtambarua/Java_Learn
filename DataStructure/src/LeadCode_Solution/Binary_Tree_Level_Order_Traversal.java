package LeadCode_Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import dataStructure.aray;

public class Binary_Tree_Level_Order_Traversal {

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

	public Binary_Tree_Level_Order_Traversal()
	{
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
//		root.left.left=new TreeNode(4);
//		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		//root=null;
		System.out.println(levelOrder(root));
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
		
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
		return result;
	}
}
