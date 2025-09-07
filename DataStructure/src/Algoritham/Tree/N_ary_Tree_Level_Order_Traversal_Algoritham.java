package Algoritham.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_ary_Tree_Level_Order_Traversal_Algoritham {
	
	private class Node{
		int val;
		public List<Node> children;
		private Node(int val)
		{
			this.val=val;
			children=new ArrayList<>();
		}
		private Node(int val,List<Node> childen)
		{
			this.val=val;
			this.children=childen;
		}
	}
	
	public N_ary_Tree_Level_Order_Traversal_Algoritham()
	{
		Node root=new Node(1);
		root.children.add(new Node(2));
		root.children.add(new Node(3));
		root.children.get(0).children.add(new Node(4));
		root.children.get(0).children.add(new Node(5));
		root.children.get(0).children.add(new Node(6));
		root.children.get(0).children.get(1).children.add(new Node(7));
		
		System.out.println(levelOrder(root));
		
		List<Node> childen=new LinkedList<>();
		childen=Arrays.asList(new Node(7));
		childen=Arrays.asList(new Node(4),new Node(5,childen),new Node(6));
		childen=Arrays.asList(new Node(2,childen),new Node(3));
		Node root2=new Node(1,childen);
		
		System.out.println(levelOrder(root2));
	}

	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result=new ArrayList<>();
		if(root==null)
		{
			return result;
		}
		Queue<Node> qu=new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty())
		{
			List<Integer> list=new ArrayList<>();
			int qusize=qu.size();
			for(int j=0;j<qusize;j++)
			{
				Node current=qu.poll();
				int size=current.children.size();
				list.add(current.val);
				for(int i=0;i<size;i++)
				{
					qu.add(current.children.get(i));
				}
			}
			result.add(list);
		}
		return result;
	}
}
