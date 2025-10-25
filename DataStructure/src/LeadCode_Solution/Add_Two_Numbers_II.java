package LeadCode_Solution;

import java.util.ArrayDeque;
import java.util.Deque;


public class Add_Two_Numbers_II {
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int val)
		{
			this.val=val;
			this.next=null;
		}
	}
	public Add_Two_Numbers_II()
	{
//		ListNode l1=new ListNode(7);
//		l1.next=new ListNode(2);
//		l1.next.next=new ListNode(4);
//		l1.next.next.next=new ListNode(3);
		
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);


		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);

		addTwoNumbers(l1,l2);
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Deque<Integer> num1=new ArrayDeque<Integer>(),num2=new ArrayDeque<Integer>(),sum=new ArrayDeque<Integer>();
		addStack(num1,l1);
		addStack(num2,l2);
		int carry=0;
		while(!num1.isEmpty()||!num2.isEmpty()||carry!=0)
		{
			int add=(num1.peek()==null?0:num1.poll())+
					(num2.peek()==null?0:num2.poll())+carry;
			carry=add/10;
			sum.push(add%10);
		}
		ListNode dummy=new ListNode(sum.pop());
		ListNode result=dummy;
		while(!sum.isEmpty())
		{
			result.next=new ListNode(sum.pop());
			result=result.next;
		}
		return dummy;
	}
	public void addStack(Deque<Integer> num1,ListNode l1)
	{
		if(l1==null)
		{
			return;
		}
		num1.push(l1.val);
		addStack(num1,l1.next);
	}
}
