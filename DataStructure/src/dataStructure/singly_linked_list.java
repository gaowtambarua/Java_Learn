package dataStructure;

public class singly_linked_list {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public singly_linked_list() {
        // mainwork();

        mainwork2();
    }

    public void mainwork() {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }

        System.out.println();
    }

    public void mainwork2() {
        ListNode head = new ListNode(0);
        ListNode present = head;

        for (int i = 1; i < 5; i++) {
            present.next = new ListNode(i);
            present = present.next;
        }
        //////////////// present = 4;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
