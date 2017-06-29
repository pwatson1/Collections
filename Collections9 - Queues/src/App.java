import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// (head) <- ooooooooooooo <- (tail) (FIFO)
		// (the first item in is the first item out)
		
		//ArrayBlockingQueue must have a fixed size assigned
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);	
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("The number at the head is " + q1.element());
		
		try {
			q1.add(40);
			
		}catch(IllegalStateException e) {
			
			System.out.println(e.toString() + ": Tried to add too many items to the string.");
			
		}
		
		for(Integer element: q1){
			System.out.println(element);
		}
		
		Integer value= q1.remove();
		
		System.out.println("Removed from queue " + value);
		System.out.println(q1);
		
		System.out.println("Removing from queue " + q1.remove());
		System.out.println("Removing from queue " + q1.remove());
		
		try{
			System.out.println("Removing from queue " + q1.remove());
			
		}catch(NoSuchElementException e) {
			System.out.println(e.toString() + ": Tried to remove too many elements from the queue.");
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);	
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		for(Integer item : q2){
			System.out.println("Queue value is " + item);
		}
		
		if(q2.offer(30) == false) {
				System.out.println("Offer failed to add third item");
		}
		
		System.out.println("emoving item from queue: "+ q2.poll());
		System.out.println("emoving item from queue: "+ q2.poll());
		System.out.println("emoving item from queue: "+ q2.poll());
		
		
	}

}
