
public class StackTest {

	public static void main(String[] args) {
		
		//StackArrayBased stack = new StackArrayBased();
		StackLinkedList stack = new StackLinkedList();
		stack.push(10); // 10 -> stack[0]
		stack.push(11); // 11 -> stack[1]
		stack.push(12); // 12 -> stack[2]
		
		System.out.println(stack.peek()); // output -> 12
		System.out.println(stack.pop());  // output -> 12
		System.out.println(stack.peek()); // output -> 11

	}

}
