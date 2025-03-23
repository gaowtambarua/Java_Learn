package dataStructure;

public class SinglyLinkList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    class ListLink {
        ListNode head = null;
        ListNode present;

        /////////////////////////////////////////// insert
        /////////////////////////////////////////// //////////////////////////////////////////////////////
        public void insert(int node) {
            if (head == null) {
                head = new ListNode(node);
                present = head;
            } else {
                present.next = new ListNode(node);
                present = present.next;
            }
        }

        /////////////////////////////////////////// display
        /////////////////////////////////////////// //////////////////////////////////////////////////////
        /// display() মেথডে head পরিবর্তন হচ্ছে
        /// display() মেথডে head পরিবর্তন হওয়ায় লিঙ্কড লিস্ট হারিয়ে যাচ্ছে।
        /// ফলে, একবার display() কল করার পর লিস্টের রেফারেন্স নষ্ট হয়ে যাবে এবং পুনরায়
        /////////////////////////////////////////// কোনো অপারেশন করা সম্ভব হবে না।\এই
        /////////////////////////////////////////// সমস্যাটি ঠিক করতে,
        /// head পরিবর্তন না করে একটি অস্থায়ী (temporary) ভেরিয়েবল ব্যবহার করা উচিত।
        // public void display() {
        // while (head != null) {
        // System.out.println(head.val);
        // head = head.next;
        // }
        // }

        public void display() {
            ListNode temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }

    }

    public SinglyLinkList() {

        ListLink list = new ListLink();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(50);
        list.insert(70);

        System.out.println("\nLinked List:");
        list.display();
    }
}
