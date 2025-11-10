package LeadCode_Solution;

public class Remove_Nodes_From_Linked_List {
	public class ListNode
	{
		ListNode next;
		int val;
		public ListNode(int val)
		{
			this.val=val;
			this.next=null;
		}
	}
	public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        int max=Integer.MIN_VALUE;
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        while(head!=null)
        {
            if(head.val>=max)
            {
                result.next=new ListNode(head.val);
                max=head.val;
                result=result.next;
            }
            head=head.next;
        }
        result=reverse(dummy.next);
        return result;
    }
    private ListNode reverse(ListNode head)
    {
        ListNode pre=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
	
}
