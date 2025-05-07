package LeadCode_Solution;

public class Reverse_Linked_List_ {

	ListNode head = null;
	ListNode presentnode = null;

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	class LinnkList {

		public void display() {
			ListNode tempNode = head;
			while (tempNode != null) {
				System.out.println(tempNode.val);
				tempNode = tempNode.next;
			}
		}

		public void insert(ListNode valu) {
			if (head == null) {
				head = valu;
				presentnode = head;
				return;
			} else {
				presentnode.next = valu;
				presentnode = presentnode.next;
			}
		}

		public ListNode reverseList(ListNode head)// 1,2,3,4,5
		{
			if (head == null || head.next == null) {
				return head;
			}
			ListNode p = reverseList(head.next);
			head.next.next = head;
			head.next = null;
			return p;
			/*
			 * 5           5.4.null     5.4.3.null     5.4.3.2.null
			 * 5.4         5.4.3        5.4.3.2        5.4.3.2.1
			 * 5.4.null    5.4.3.null   5.4.3.2.null   5.4.3.2.1.null
			 */
		}

		public ListNode reverseList2(ListNode head)// 1,2,3
		{
			ListNode present = head; // 0
			ListNode pr = null;
			while (present != null) { // 0 1
				ListNode next = present.next;
				present.next = pr; // 0.null 1.0
				pr = present;
				present = next;//
			}
			return pr;
		}
	}

	public Reverse_Linked_List_() {

		LinnkList list = new LinnkList();
		list.insert(new ListNode(0));
		list.insert(new ListNode(1));
		list.insert(new ListNode(2));
		list.insert(new ListNode(3));
		list.insert(new ListNode(4));
		list.insert(new ListNode(5));

		System.out.println("\n Output:   \n");

		// list.display();

		// ListNode n = list.reverseList(head);
		// while (n != null) {
		// System.out.println(n.val);
		// n = n.next;
		// }

		ListNode n = list.reverseList2(head);
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}

}
