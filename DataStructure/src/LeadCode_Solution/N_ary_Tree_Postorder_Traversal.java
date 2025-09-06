package LeadCode_Solution;

import java.util.ArrayList;
import java.util.List;


public class N_ary_Tree_Postorder_Traversal {
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

	public N_ary_Tree_Postorder_Traversal()
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

		System.out.println(postorder(root));
	}

	public List<Integer> postorder(Node root) {
		List<Integer> result=new ArrayList<Integer>();
		if(root==null)
		{
			return result;
		}
		dfs(root,result);
		return result;
	}
	public void dfs(Node root,List<Integer> result)
	{
		int size=root.children.size();
		for(int i=0;i<size;i++)
		{
			dfs(root.children.get(i),result);
		}
		result.add(root.val);
	}

}
