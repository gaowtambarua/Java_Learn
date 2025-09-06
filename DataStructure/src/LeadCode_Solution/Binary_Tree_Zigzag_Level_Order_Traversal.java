package LeadCode_Solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
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
	public Binary_Tree_Zigzag_Level_Order_Traversal()
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		//root=null;
		System.out.println(zigzagLevelOrder(root));
	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result=new LinkedList<>();
		if(root==null)
		{
			return result;
		}
		Deque<TreeNode> que=new ArrayDeque<>();
		que.push(root);
		int alternate=0;
		while(!que.isEmpty())
		{
			LinkedList<Integer> node=new LinkedList<Integer>();
			int size=que.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=que.poll();
				if(alternate==0)
				{
					node.addLast(current.val);
				}
				else if(alternate==1)
				{
					node.addFirst(current.val);
				}
				if(current.left!=null)
				{
					que.addLast(current.left);
				}
				if(current.right!=null)
				{
					que.addLast(current.right);
				}
			}
			alternate=1-alternate;
			result.add(node);
		}
		return result;
	}
}
