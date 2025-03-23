package LeadCode_Solution;

import dataStructure.singly_linked_list.ListNode;

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
    }

    public Reverse_Linked_List_() {
        LinnkList list = new LinnkList();
        list.insert(new ListNode(0));
        list.insert(new ListNode(1));
        list.insert(new ListNode(2));
        list.insert(new ListNode(3));

        System.out.println("\n Output:   \n");

        list.display();
    }

}
