package Algoritham.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Algoritham.Tree.Recursive_Traversals.TreeNode;


public class Iterative_Traversal {
	public class TreeNode{
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

	public Iterative_Traversal()
	{
		///////////////   Inorder / Preorder / Postorder → DFS nature → Stack (LIFO) // Last In Fast Out
		//////////////    Level Order → BFS nature → Queue (FIFO) /////// First in First Out


		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);

		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);

		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);

		// Root → Left → Right
		// Pre Order
		List<Integer> dfspreres=new LinkedList<Integer>();
		preorder(root, dfspreres);
		System.out.println("\n\n\nFor DFS preorder = "+dfspreres);

		// Left → Root → Right
		// InOrder
		List<Integer> dfsInorderres=new LinkedList<Integer>();
		inorderTraversal(root,dfsInorderres);
		System.out.println("For DFS inorder ="+dfsInorderres);




		// Left → Right → Root

		//////////////////////// Post Order Two Stack (Like PreOrder)
		List<Integer> listTwoStackPostOrder=new LinkedList<Integer>();
		funTwoStackPostOrder(root,listTwoStackPostOrder);
		System.out.println("For DFS postorder Two Stack ="+listTwoStackPostOrder);

		////////////////////////Post Order One Stack (Like InOrder)
		List<Integer> listOneStackPostOrder=new LinkedList<>();
		funOneStackPostOrder(root,listOneStackPostOrder);
		System.out.println("For DFS postorder One Stack ="+listOneStackPostOrder);

		// Lever Order (BFS)First In Firs Out
		List<Integer> bfsLevelOrder=new LinkedList<Integer>();
		funLevelOrder(root,bfsLevelOrder);
		System.out.println("For BFS Levelorder ="+bfsLevelOrder);
	}
	public void funLevelOrder(TreeNode root,List<Integer> bfsLevelOrder)
	{
		Queue<TreeNode> qu=new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty())
		{
			TreeNode present=qu.poll();
			bfsLevelOrder.add(present.val);
			if(present.left!=null)
			{
				qu.add(present.left);
			}
			if(present.right!=null)
			{
				qu.add(present.right);
			}
		}
	}
	public void funOneStackPostOrder(TreeNode root,List<Integer> listOneStackPostOrder)
	{
		Deque<TreeNode> stack=new ArrayDeque();
		TreeNode lastVisited=null;
		while(root!=null||!stack.isEmpty())
		{
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
			TreeNode peackNode=stack.peek();
			if(peackNode.right!=null&&peackNode.right!=lastVisited)
			{
				root=peackNode.right;
			}
			else
			{
				stack.pop();
				listOneStackPostOrder.add(peackNode.val);
				lastVisited=peackNode;
			}
		}
	}
	public void funTwoStackPostOrder(TreeNode root,List<Integer> listTwoStackPostOrder)
	{
		Deque<TreeNode> stack1=new ArrayDeque<>();
		Deque<TreeNode> stack2=new ArrayDeque<>();
		stack1.push(root);
		while(!stack1.isEmpty())
		{
			TreeNode present=stack1.pop();
			stack2.push(present);
			if(present.left!=null)
			{
				stack1.push(present.left);
			}
			if(present.right!=null)
			{
				stack1.push(present.right);
			}
		}
		while(!stack2.isEmpty())
		{
			listTwoStackPostOrder.add(stack2.pop().val);
		}
	}
	public void  preorder(TreeNode root,List<Integer> dfsInorderres)
	{
		Deque<TreeNode> dq=new ArrayDeque<>();
		dq.push(root);
		while(!dq.isEmpty())
		{
			TreeNode present=dq.pop();
			dfsInorderres.add(present.val);
			if(present.right!=null)
			{
				dq.push(present.right);
			}
			if(present.left!=null)
			{
				dq.push(present.left);
			}
		}
	}
	public void inorderTraversal(TreeNode root,List<Integer> dfsInorderres)
	{
		Deque<TreeNode> stack = new ArrayDeque<>();
		while(root!=null||!stack.isEmpty())
		{
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
			root=stack.pop();
			dfsInorderres.add(root.val);
			root=root.right;
		}
	}
}
