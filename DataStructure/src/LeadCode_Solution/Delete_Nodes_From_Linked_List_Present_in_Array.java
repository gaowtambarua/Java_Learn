package LeadCode_Solution;
import java.util.*;
public class Delete_Nodes_From_Linked_List_Present_in_Array {
	public class ListNode
	{
		int val;
		ListNode next;
		public ListNode(int val)
		{
			this.val=val;
			this.next=null;
		}
	}
	public Delete_Nodes_From_Linked_List_Present_in_Array()
	{

	}
	public ListNode modifiedList(int[] nums, ListNode head) {
		 Set<Integer> checkValue=new HashSet<Integer>();
	        for(int val : nums)
	        {
	            checkValue.add(val);
	        }
	        ListNode dummy=new ListNode(0);
	        ListNode current=dummy;
	        while(head!=null)
	        {
	            if(!checkValue.contains(head.val))
	            {
	                current.next=new ListNode(head.val);
	                current=current.next;
	            }
	            head=head.next;
	        }
	        return dummy.next;
	}

}
