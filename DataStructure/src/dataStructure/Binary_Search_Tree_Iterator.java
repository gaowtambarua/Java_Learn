package dataStructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Binary_Search_Tree_Iterator {

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

	///////////////// 1	
	//	private class BSTIterator{
	//		List<Integer> result=new ArrayList<Integer>();
	//		int i=0;
	//		public BSTIterator(TreeNode root) {
	//	        inordertravarsal(root);
	//	        System.out.println(result);
	//	    }
	//		public void inordertravarsal(TreeNode root)
	//		{
	//			Deque<TreeNode> dq= new ArrayDeque<>();
	//			while(root!=null||!dq.isEmpty())
	//			{
	//				while(root!=null)
	//				{
	//					dq.push(root);
	//					root=root.left;
	//				}
	//				root=dq.pop();
	//				result.add(root.val);
	//				root=root.right;
	//			}
	//		}
	//	    
	//	    public int next() {
	//	    	int val=result.get(i);
	//	    	i++;
	//	        return val;
	//	    }
	//	    
	//	    public boolean hasNext() {
	//	    	try
	//	    	{
	//	    		result.get(i);
	//	    		return true;
	//	    	}
	//	    	catch(Exception exception)
	//	    	{
	//	    		return false;
	//	    	}
	//	    }
	//	}

	////////////////////////////////////////////////////////////

	class BSTIterator {
		TreeNode root=null;
		Deque<TreeNode> stack=new ArrayDeque<TreeNode>();
		public BSTIterator(TreeNode root) {
			this.root=root;
			while(this.root!=null)
			{
				stack.push(this.root);
				this.root=this.root.left;
			}
		}

		public int next() {
			TreeNode node=stack.pop();
			 root=node.right;
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
			return node.val;
		}

		public boolean hasNext() {
			return !stack.isEmpty();
		}
	}


	public Binary_Search_Tree_Iterator()
	{
		TreeNode root=new TreeNode(7);
		root.left=new TreeNode(3);
		root.right=new TreeNode(15);
		root.right.left=new TreeNode(9);
		root.right.right=new TreeNode(20);

		BSTIterator bSTIterator =new BSTIterator(root);
//		System.out.println(bSTIterator.hasNext());
//		System.out.println(bSTIterator.next());
//		System.out.println(bSTIterator.hasNext());
//		System.out.println(bSTIterator.next());
//		System.out.println(bSTIterator.hasNext());
//		System.out.println(bSTIterator.next());
//		System.out.println(bSTIterator.hasNext());
//		System.out.println(bSTIterator.next());
//		System.out.println(bSTIterator.hasNext());
//		System.out.println(bSTIterator.next());
//		System.out.println(bSTIterator.hasNext());
		while(bSTIterator.hasNext())
		{
			System.out.println(bSTIterator.next());
		}
	}
}
