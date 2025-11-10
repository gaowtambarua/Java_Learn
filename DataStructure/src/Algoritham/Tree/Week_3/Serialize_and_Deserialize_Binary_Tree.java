package Algoritham.Tree.Week_3;
import java.util.*;

import javax.xml.bind.ParseConversionEvent;
public class Serialize_and_Deserialize_Binary_Tree {
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
	public Serialize_and_Deserialize_Binary_Tree()
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(5);
		TreeNode root2=null;
		root2=deserialize(serialize(root));
		System.out.println(root2.right.right.val);
		System.out.println(serialize(root));
	}
	public String serialize(TreeNode root) {
		if(root==null)
		{
			return null;
		}
		Deque<TreeNode> dq=new LinkedList<TreeNode>();
		dq.offer(root);
		String result="";
		while(!dq.isEmpty())
		{
			TreeNode node=dq.poll();
			if(node==null)
			{
				result=result+node+",";
				continue;
			}
			result=result+node.val+",";
			dq.offer(node.left);
			dq.offer(node.right);
		}
		return result;
	}
	public TreeNode deserialize(String data) {
		if(data==null)
		{
			return null;
		}
		String str []=data.split(",");
		TreeNode root=new TreeNode(Integer.parseInt(str[0]));
		Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
		dq.offer(root);
		int i=1;
		while(i<str.length)
		{
			TreeNode node=dq.poll();
			if(!str[i].equals("null"))
			{
				TreeNode left=new TreeNode(Integer.parseInt(str[i]));
				node.left=left;
				dq.offer(left);
			}
			i++;
			if(i<str.length && !str[i].equals("null"))
			{
				TreeNode right=new TreeNode(Integer.parseInt(str[i]));
				node.right=right;
				dq.offer(right);
			}
			i++;
		}
		return root;
	}
}
