package LeadCode_Solution;

import java.util.LinkedList;
import java.util.List;

public class Convert_Sorted_List_to_Binary_Search_Tree_109 {
	
	public class ListNode
	{
		int val;
		ListNode next;
		public ListNode(int val,ListNode next)
		{
			this.val=val;
			this.next=next;
		}
	}
	
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
	
	public Convert_Sorted_List_to_Binary_Search_Tree_109()
	{
		ListNode node1=new ListNode(9, null);
		node1=new ListNode(5, node1);
		node1=new ListNode(0, node1);
		node1=new ListNode(-3, node1);
		node1=new ListNode(-10, node1);
		
		int i=0;
		
		System.out.println(sortedListToBST(node1).val);
	}
	public TreeNode sortedListToBST(ListNode head)
	{
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return new TreeNode(head.val);
		}
		ListNode slow=head,fast=head,pre=null;
		while(fast!=null&&fast.next!=null)
		{
			pre=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		if(pre!=null)
		{
			pre.next=null;
		}
		TreeNode left=null,right=null,result=new TreeNode(slow.val);
		left=sortedListToBST(head);
		right=sortedListToBST(slow.next);
		result.left=left;
		result.right=right;
		return result;
	}
//	public TreeNode sortedListToBST(ListNode head)
//	{
//		List<Integer> list=new LinkedList<Integer>();
//		while(head!=null)
//		{
//			list.add(head.val);
//			head=head.next;
//		}
//		return buildBSTTree(list,0,list.size()-1);
//	}
//	public TreeNode buildBSTTree(List<Integer> list,int low,int high)
//	{
//		if(high<low)
//		{
//			return null;
//		}
//		int mid=low+(high-low)/2;
//		TreeNode left=buildBSTTree(list,low,mid-1);
//		TreeNode right=buildBSTTree(list,mid+1,high);
//		
//		TreeNode result=new TreeNode(list.get(mid));
//		result.left=left;
//		result.right=right;
//		return result;
//	}
	
}
