package Algoritham.Tree.Week_3;
import java.util.*;
public class Path_Sum_II {
	public class TreeNode
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
	public Path_Sum_II()
	{
		
	}
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> result=new LinkedList<List<Integer>>();
	        pathSum(root,targetSum,new ArrayList<Integer>(),result);
	        return result;
	    }
	    private void pathSum(TreeNode root,int targetSum,List<Integer> list,List<List<Integer>> result)
	    {
	        if(root==null)
	        {
	            return;
	        }
	        list.add(root.val);
	        if(root.left==null&&root.right==null&&root.val==targetSum)
	        {
	            result.add(new ArrayList<>(list));
	        }
	        pathSum(root.left,targetSum-root.val,list,result);
	        pathSum(root.right,targetSum-root.val,list,result);
	        list.remove(list.size()-1);
	    }
}
