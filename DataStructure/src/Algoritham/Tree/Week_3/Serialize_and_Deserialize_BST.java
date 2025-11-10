package Algoritham.Tree.Week_3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Serialize_and_Deserialize_BST {
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
	public Serialize_and_Deserialize_BST()
	{
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(0);
		//root=null;
		System.out.println(serialize(root));
		String s=serialize(root);
		System.out.println(deserialize(s));

	}
	
	public String serialize(TreeNode root) {
		if(root==null)
		{
			return null;
		}
		String s="";
		Deque<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode node =q.poll();
			if (node == null) {
				s=s+"null,";
				continue;
			}
			q.offer(node.left);
			q.offer(node.right);
			s=s+""+(node.val)+",";
		}
		return s;
	}
	
	
	// Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	if(data==null)
    	{
    		return null;
    	}
        String str[]=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(str[0]));
        Deque<TreeNode> dq=new LinkedList<>();
        dq.offer(root);
        int i=1;
        while(!dq.isEmpty()&&i<str.length)
        {
        	TreeNode node=dq.poll();
        	if(!str[i].equals("null"))
        	{
        		TreeNode left=new TreeNode(Integer.parseInt(str[i]));
        		node.left=left;
        		dq.offer(left);
        	}
        	i++;
        	if(i<str.length &&!str[i].equals("null"))
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
