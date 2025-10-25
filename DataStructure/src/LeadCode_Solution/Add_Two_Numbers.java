package LeadCode_Solution;

public class Add_Two_Numbers {
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int val)
		{
			this.val=val;
			this.next=null;
		}
	}
	public Add_Two_Numbers()
	{
		ListNode l1=new ListNode(2);
		l1=null;
//		l1.next=new ListNode(4);
//		l1.next.next=new ListNode(3);

		System.out.println(l1.next!=null?l1:null);


		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		addTwoNumbers(l1,l2);

		

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		
		return add(l1,l2,0);
	}
	public ListNode  add(ListNode l1,ListNode l2,int carry)
	{
		if(l1==null&&l2==null&&carry==0)
		{
			return null;
		}
		int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
		ListNode node=new ListNode(sum%10);
		carry=sum/10;
		node.next=add((l1==null?null:l1.next),(l2==null?null:l2.next),carry);
		return node;
	}
}
