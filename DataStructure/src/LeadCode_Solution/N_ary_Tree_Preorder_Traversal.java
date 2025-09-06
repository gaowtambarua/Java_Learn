package LeadCode_Solution;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class N_ary_Tree_Preorder_Traversal {
	
	private class Node 
	{
		int val;
		List<Node> children;
		private Node(int val)
		{
			this.val=val;
			children=new ArrayList<>();
		}
	}
	
	public N_ary_Tree_Preorder_Traversal()
	{
		Node root=new Node(1);
		root.children.add(new Node(2));
		root.children.add(new Node(3));
		root.children.add(new Node(4));
		root.children.add(new Node(5));
		root.children.add(new Node(6));
		root.children.add(new Node(7));
		
		root.children.get(2).children.add(new Node(8));
		root.children.get(2).children.add(new Node(9));
		
		
		
		System.out.println(preorder(root));
	}
	
	public List<Integer> preorder(Node root) {
		List<Integer> result=new ArrayList<>();
		if(root==null)
		{
			return result;
		}
		Deque<Node> dq=new ArrayDeque<>();
		dq.add(root);
		while(!dq.isEmpty())
		{
			Node current=dq.pop();
			result.add(current.val);
			int size=current.children.size()-1;
			for(int i=size;i>=0;i--)
			{
				dq.push(current.children.get(i));
			}
		}
		
		return result;
	}
}
