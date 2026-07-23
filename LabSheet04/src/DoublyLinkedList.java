
public class DoublyLinkedList {
	
	// Attributes in Class DoublyLinkedList
	private Node head;
	private Node tail;
	
	// Default Constructor
	public DoublyLinkedList () {
		this.head = null;
		this.tail = null;
	}
	
	// Method for traverse all nodes
	public String traversal() {
		Node current_node = head;
		String result = "[";
		boolean first = true;
		while (current_node != null) {
			result += (!first ? ", " : "") + current_node.data;
			current_node = current_node.next;
			first = false;
		}
		result += "]";
		return result;
	}

	// Method for inserting at the end of list
	public void insert(Object value) {
		Node new_node = new Node(value);
		
		if (head == null) { //check if if is empty list
			head = new_node;
			tail = new_node;
		}else {
			tail.next = new_node;
			new_node.previous = tail;
			tail = new_node;
		}
	}
	
	// Method for inserting at the beginning and specific position
	public void insert(int position, Object value) {
		Node new_node = new Node(value);
		
		if (head == null) { //check if if is empty list
			head = new_node;
			tail = new_node;
		}else if (position == 0) {
			new_node.next = head;
			head.previous = new_node;
			head = new_node;
		}else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position -1) {
				current_node = current_node.next;
				current_position++;
			}
			// insert 'new_node' to the specific position
			new_node.next = current_node.next;
			new_node.previous = current_node;
			current_node.next.previous = new_node;
			current_node.next = new_node;
		}
	}

	// Method for deleting the last node
	public void remove() {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node
				head = null;
				tail = null;
			} else {
				// write statement for deleting the last node
				Node curr_node = tail;
				tail = curr_node.previous;
				tail.next =null;
					
				}
			}
	}
	
	// Method for deleting at the beginning and specific position
	public void remove(int position) {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node
				head = null;
				tail = null;
			} else if (position == 0) {
				// write statement for deleting the beginning
				
			} else {
				// write statement for deleting the specific position
				Node curr_node = head;
				int curr_position = 0;
				while (curr_node != null && curr_position < position-1) {
					curr_node = curr_node.next;
					position++;
				}
				curr_node.next.previous = curr_node.previous;
				curr_node.previous.next = curr_node.next;
				curr_node.next = null;
				curr_node.previous = null;
				
			}
		}
		
	}

	// Method for a backward traversal (from the last node to the first node)
	public String backwardTraversal() {
		Node current_node = tail;
		String result = "[";
		boolean first = true;
		while (current_node != null) {
			result += (!first ? ", " : "") + current_node.data;
			current_node = current_node.previous;
			first = false;
		}
		result += "]";
		return result;
	}
	
}