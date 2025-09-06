package LeadCode_Solution;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth_of_Binary_Tree {

	private class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		private TreeNode(int val)
		{
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}

	public Minimum_Depth_of_Binary_Tree()
	{
		TreeNode root=new TreeNode(3);
		//root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		//root.right.right=new TreeNode(7);
		//////////////// DFS ///////////////////////
		System.out.println("For DFS : "+minDepth(root));


		//////////////// BFS ///////////////////////
		System.out.println("For BFS : "+minDepthBFS(root));
	}
	
	//////////////// BFS
	public int minDepthBFS(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int min=1;
		Queue<TreeNode> qu=new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty())
		{
			int size=qu.size();
			for(int i=0;i<size;i++)
			{
				TreeNode current=qu.poll();
				if(current.left==null&&current.right==null)
				{
					return min;
				}
				if(current.left!=null)
				{
					qu.add(current.left);
				}
				if(current.right!=null)
				{
					qu.add(current.right);
				}
			}
			min=min+1;
		}
		return min;
	}


	/////////////////DFS 
	public int minDepth(TreeNode root) {
		if(root==null)
		{
			return 0;
		}
		if(root.left==null&&root.right==null)
		{
			return 1;
		}
		int left=minDepth(root.left);
		int right=minDepth(root.right);
		if(root.left==null)
		{
			left=right;
		}
		if(root.right==null)
		{
			right=left;
		}
		return Math.min(left,right)+1;
	}
}
