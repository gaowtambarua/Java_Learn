package LeadCode_Solution;

public class Linked_List_Cycle {
	public  class ListNode{
		int val;
		ListNode next;
		public ListNode(int val)
		{
			this.val=val;
		}
	}
	/// 0 1 2 1 2 1 2
    //              ..    	    
	public Linked_List_Cycle()
	{
		ListNode a=new ListNode(0);
		a.next=new ListNode(1);
		a.next.next=new ListNode(2);
		ListNode pos=a.next;
		a.next.next.next=pos;
		System.out.println(hasCycle(a));
	}
	//1 1 null
	public boolean hasCycle(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false; 
	}

}
