
public class StackLinkedList {
   
   // pointer to the top node
   private Node top;

   // create an empty stack
   public StackLinkedList() {
      top = null;
   }
   
   public boolean isEmpty() {
	   return top == null;
   }
   
   public void push(int value) {
	   Node new_node = new Node(value);
	   if (isEmpty()) {
		   top = new_node;
	   }else {
		   new_node.next = top;
		   top = new_node;
	   }
   }
   
   public int peek() {
	   return !isEmpty() ? top.data : -1;
   }
   
   public int pop() {
	   if (isEmpty()) {
		   return -1;
	   }
	   Node temp_node = top;			//back up node
	   int temp_data = temp_node.data;	//back up data in node
	   
	   top = top.next; // move top to the next node
	   
	   temp_node = null;
	   
	   return temp_data;
	   
   }
   
   

}