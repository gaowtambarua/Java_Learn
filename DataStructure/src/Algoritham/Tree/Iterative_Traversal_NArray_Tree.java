package Algoritham.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Iterative_Traversal_NArray_Tree {

	private class NTreeNode
	{
		int val;
		List<NTreeNode> node;
		private NTreeNode(int val)
		{
			this.val=val;
			node=new ArrayList<>();
		}
	}

	public Iterative_Traversal_NArray_Tree()
	{
		NTreeNode root=new NTreeNode(1);

		root.node.add(new NTreeNode(2));
		root.node.add(new NTreeNode(3));
		root.node.add(new NTreeNode(4));
		root.node.add(new NTreeNode(5));
		root.node.add(new NTreeNode(6));
		root.node.add(new NTreeNode(7));

		root.node.get(2).node.add(new NTreeNode(8));
		root.node.get(2).node.add(new NTreeNode(9));
		
		// Root → Left → Right
		// Pre Order
		System.out.println(preorder(root));
	}
//	public List<Integer> preorder(NTreeNode root) {
//		List<Integer> result=new ArrayList<>();
//		if(root==null)
//		{
//			return result;
//		}
//		Deque<NTreeNode> dq=new ArrayDeque<>();
//		dq.add(root);
//		while(!dq.isEmpty())
//		{
//			NTreeNode current=dq.pop();
//			result.add(current.val);
//			int size=current.node.size();
//			for(int i=size-1;i>=0;i--)
//			{
//				dq.push(current.node.get(i));
//			}
//		}
//		return result;
//	}
	public List<Integer> preorder(NTreeNode root) {
        List<Integer> result=new ArrayList<>();
		if(root==null)
		{
			return result;
		}
		Deque<NTreeNode> dq=new ArrayDeque<>();
		dq.add(root);
		while(!dq.isEmpty())
		{
			NTreeNode current=dq.pop();
			result.add(current.val);
			int size=current.node.size();
			for(int i=size-1;i>=0;i--)
			{
				dq.push(current.node.get(i));
			}
		}
		return result;
    }
}
