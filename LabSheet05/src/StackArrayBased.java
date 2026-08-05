public class StackArrayBased {
	
   private int[] stacks;	 	// array to store elements
   private final int MAX_STACK = 50;	// maximum size of stack
   private int top;		 	// index of the top element

   // create an empty stack with a maximum size
   public StackArrayBased() {
      stacks = new int[MAX_STACK];
      top = -1;
   }

   // create an empty stack with a specific size
   public StackArrayBased(int capacity) {
      stacks = new int[capacity];
      top = -1;
   }
   
   public boolean isEmpty() {
//	   if (top == -1) {
//		   return true;
//	   }
//	   return false;
	   return top == -1;
   }
   
   public boolean isFull() {
	   return top == stacks.length-1;
   }
   
   public boolean push(int new_element) {
	   if (!isFull()) { // isFull() == false
		   stacks[++top] = new_element;
		   return true;
	   }
	   return false;
   }
   
   public int peek() {
//	   if (!isEmpty()) {
//		   return stacks[top]
//	   }
//	   return -1;
	   
	   //condition ? true-result : false-result
	   
	   return !isEmpty() ? stacks[top] : -1;
   }
   
   public int pop() {
	   return !isEmpty() ? stacks[top--] : -1;
   }
   
   public int popAll() {
	   return -1;
   }
   
   public boolean check(char letter) {
	   return letter == peek();
   }
   
}