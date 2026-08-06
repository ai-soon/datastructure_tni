import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		//QueueArrayBased q = new QueueArrayBased();
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		
		Queue<Integer> q2 = new Queue<Integer>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offer(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
	}

}
