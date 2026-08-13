import java.util.ArrayDeque;
import java.util.Queue;
 
public class QueueFirstFive {
	public static Queue<Integer> queue = new ArrayDeque<Integer>();
 
	public static void main(String[] args) {
		for (int i = 101; i <= 110; i++) {
			queue.add(i);
		}
 
		
		int peekTime = 5, peeked = 0;
		
		System.out.println("Queue => " + queue);
 
		for (int i = 0; i < queue.size(); i++) {
			if (peeked < peekTime) {
				System.out.println(queue.peek());
				peeked++;
			}
			queue.add(queue.poll());
		}
		System.out.println("Queue => " + queue);
	}
}