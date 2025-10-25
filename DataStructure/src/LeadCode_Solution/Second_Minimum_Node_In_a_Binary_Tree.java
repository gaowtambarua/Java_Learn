package LeadCode_Solution;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Second_Minimum_Node_In_a_Binary_Tree {

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val)
		{
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}

	public Second_Minimum_Node_In_a_Binary_Tree()
	{
		TreeNode root=new TreeNode(7);
		root.left=new TreeNode(2);
		root.right=new TreeNode(5);
		root.right.left=new TreeNode(5);
		root.right.right=new TreeNode(7);
		System.out.println(findSecondMinimumValue(root));
		
		
	}
	public int findSecondMinimumValue(TreeNode root) {
		Set<Integer> set=new HashSet<Integer>();
		int min=Integer.MAX_VALUE;
		preOrder(root,set);
		set.remove(root.val);
		if(set.isEmpty())
		{
			return -1;
		}
		for(int num : set)
		{
			if(min>num)
			{
				min=num;
			}
		}
		return min;
	}
	public void preOrder(TreeNode root,Set<Integer> set)
	{
		if(root==null)
		{
			return ;
		}
		set.add(root.val);
		preOrder(root.left,set);
		preOrder(root.right,set);
	}
}
