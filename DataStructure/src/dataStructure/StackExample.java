package dataStructure;
import java.util.Stack;
public class StackExample {
	public StackExample()
	{
		Stack<Integer> stack = new Stack<Integer>();

		//////////////Last In fast Out

		stack.push(10);  // ঢুকানো
		stack.push(20);
		stack.push(30);

		System.out.println(stack.pop()); // বের করে → 30
		System.out.println(stack.peek()); // দেখে → 20 (কিন্তু বের করে না)
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
