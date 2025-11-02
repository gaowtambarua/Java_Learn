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
	public Remove_Nodes_From_Linked_List()
	{
		ListNode head=new ListNode(5);
		head.next=new ListNode(2);
		head.next.next=new ListNode(13);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(8);
		head=removeNodes(head);
		while(head!=null)
		{
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
	public ListNode removeNodes(ListNode head) {
		 head = reverse(head);
		return head;
	}
	private ListNode reverse(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null)
        {
        	ListNode next=curr.next;
        	curr.next=pre;
        	pre=curr;
        	curr=next;
        }
        return pre;
    }
//	private ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        return prev;
//    }
}
