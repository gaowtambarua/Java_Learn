package Algoritham.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class N_Array_Tree {
	public class Node{
		int val;
		List<Node> current;
		public Node(int val)
		{
			this.val=val;
			this.current=new ArrayList<>();
		}
	}

	public N_Array_Tree()
	{
		Node root=new Node(1);
		root.current.add(new Node(2));  //index=0
		root.current.add(new Node(3));  //index=1
		root.current.add(new Node(4));  //index=2
		root.current.add(new Node(5));  //index=3
		root.current.add(new Node(6));  //index=4
		root.current.add(new Node(7));  //index=5
		
		root.current.get(2).current.add(new Node(8));  //index=2 er khettre index=0
		root.current.get(2).current.add(new Node(9));  //index=2 er khettre index=1  
		
		System.out.println(resultVew(root));
		// root.1=new TreeNode(2);
		// root.2=new TreeNode(3);
		// root.3=new TreeNode(2);
		// root.4=new TreeNode(3);
		// root.5=new TreeNode(2);
		// root.right=new TreeNode(3);
	}
	private List<Integer> resultVew(Node root)
	{
		List<Integer> result=new ArrayList<>();
		Deque<Node> dq=new ArrayDeque<>();
		dq.add(root);
		while(!dq.isEmpty())
		{
			Node current=dq.pop();
			result.add(current.val);
			for(Node val : current.current)
			{
				dq.add(val);
			}
		}
		return result;
		
	}
}
