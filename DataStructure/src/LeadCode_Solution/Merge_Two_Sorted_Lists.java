package LeadCode_Solution;

import java.util.Scanner;

public class Merge_Two_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val) 
		{ 
			this.val = val; 
		}
	}

	public Merge_Two_Sorted_Lists()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter The Number Of List1: ");
		ListNode list1=dataAdd(sc);
		System.out.print("Please Enter The Number Of List2: ");
		ListNode list2=dataAdd(sc);
		printList(list1);
		System.out.println();
		printList(list2);
		System.out.println("\n Marge list : ");
		ListNode margList=mergeTwoLists(list1,list2);
		printList(margList);

		//		Scanner sc=new Scanner(System.in);
		//		ListNode dummy=new ListNode(-1);
		//		ListNode present=dummy;
		//		for(int i=0;i<3;i++)
		//		{
		//			present.next=new ListNode(sc.nextInt());
		//			present=present.next;
		//		}
		//		ListNode list1=dummy.next;
		//		present=dummy;
		//		for(int i=0;i<3;i++)
		//		{
		//			present.next=new ListNode(sc.nextInt());
		//			present=present.next;
		//		}
		//		ListNode list2=dummy.next;
		//		printList(list1);
		//		System.out.println();
		//		printList(list2);
	}
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy=new ListNode(-1);
		ListNode present=dummy;

		while(list1!=null&&list2!=null)
		{
			if(list1.val<list2.val)
			{
				present.next=list1;
				list1=list1.next;
			}
			else
			{
				present.next=list2;
				list2=list2.next;
			}
			present=present.next;
		}

		if(list1==null)
		{
			present.next=list2;
		}
		else
		{
			present.next=list1;
		}

		return dummy.next;
	}

	private void printList(ListNode list)
	{
		while(list!=null)
		{
			System.out.print(list.val+" ");
			list=list.next;
		}
	}
	private ListNode dataAdd(Scanner sc)
	{
		int n=sc.nextInt();
		ListNode dummy=new ListNode(0);
		ListNode present=dummy;
		for(int i=0;i<n;i++)
		{
			present.next=new ListNode(sc.nextInt());
			present=present.next;
		}
		return dummy.next;
	}
}
