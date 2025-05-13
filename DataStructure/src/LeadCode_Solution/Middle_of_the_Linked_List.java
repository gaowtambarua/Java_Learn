package LeadCode_Solution;

import java.util.Scanner;

import Algoritham.Tortoise_and_Hare_OR_Fast_and_Slow_Pointer.ListNode;

public class Middle_of_the_Linked_List {
	public class ListNode{
		int val;
		ListNode  next;
		public ListNode(int val)
		{
			this.val=val;
			next=null;
		}
	}
	
	public  Middle_of_the_Linked_List()
	{
		Scanner sc=new Scanner(System.in);
		ListNode dummy=new ListNode(-1);
		ListNode present=dummy;
		for(int i=1;i<7;i++)
		{
			present.next=new ListNode(sc.nextInt());
			present=present.next;
		}
		present=dummy.next;
		System.out.print(middleNode(present).val+" ");
		
	}
	public ListNode middleNode(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
    }
}
