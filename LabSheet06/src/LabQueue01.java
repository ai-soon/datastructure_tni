import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {

	public static void main(String[] args) {
		Queue<Integer> num_q = new ArrayDeque<Integer>();
		
		for (int i = 101;i <= 105;i++) {
			num_q.add(i);
			System.out.println("Enqueue: " + i);
			
		}
		System.out.println("Queue => " + num_q);
		System.out.println();
		
		while (num_q.isEmpty() == false) {
			System.out.println("Calling number: " + num_q.peek());
			System.out.println("Providing service number: " + num_q.poll());
			System.out.println();
		}
		System.out.println("Queue => " + num_q);
	}

}
