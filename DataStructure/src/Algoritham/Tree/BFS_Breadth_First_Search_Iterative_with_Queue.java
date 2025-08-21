package Algoritham.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Breadth_First_Search_Iterative_with_Queue {
	private class TreeNode{
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
	
	public BFS_Breadth_First_Search_Iterative_with_Queue()
	{
		TreeNode root=new TreeNode(3);
		
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		
		root.right.left.left=new TreeNode(8);
		root.right.left.right=new TreeNode(9);
		
		root.right.left.right.left=new TreeNode(10);
		root.right.left.right.right=new TreeNode(11);
		
		System.out.println(maxDepth(root));
		
		
		Queue<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int n=list.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(list.poll());
		}
	}
	
	public int maxDepth(TreeNode root) {
		if(root==null)
		{
			return 0;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		int def=0;
		while(!queue.isEmpty())
		{
			int size=queue.size();
			def++;
			for(int i=0;i<size;i++)
			{
				TreeNode current=queue.poll();
				if(current.left!=null)
				{
					queue.add(current.left);
				}
				if(current.right!=null)
				{
					queue.add(current.right);
				}
			}
		}
		return def;
    }
}
