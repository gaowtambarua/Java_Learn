package dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Stack_And_Quee {
	public Deque_Stack_And_Quee()
	{
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addLast(30);
		dq.addLast(50);
		System.out.println(dq);

		///Quee Work  First in Farst out
		Deque<Integer> dq2=new ArrayDeque<Integer>();
		dq2.addLast(10);
		dq2.addLast(20);
		dq2.addLast(30);
		dq2.addLast(40);
		System.out.println("\nFor Quee "+dq2);
		dq2.removeFirst();
		System.out.println("After Remove "+dq2);

		///Stack Work  Last in First out
		Deque<Integer> dq3=new ArrayDeque<Integer>();
		dq3.addLast(10);
		dq3.addLast(20);
		dq3.addLast(30);
		dq3.addLast(40);
		System.out.println("\nFor Stack "+dq3);
		dq3.removeLast();
		System.out.println("After Remove "+dq3);
	}
}
