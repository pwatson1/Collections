import java.util.ArrayList;
import java.util.LinkedList;
// All parameterized list implement the List interface
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally
		 * A bunch of elements stacked next to each other
		 * [0][1][2][3][4][5]...
		 */
		// All parameterized list implement the List interface
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element
		 * [0]<->[1]<->[2]<->[3]...
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		// All parameterized list implement the List interface
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	// All parameterized list implement the List interface
	private static void doTimings(String type, List<Integer> list) {
		
		// Add items at the beginning of the list
		for(int i = 0; i<1E5; i++) {
			list.add(i+1);
		}
		
		long start = System.currentTimeMillis();
		
		// Add items at the end of the list
		//for(int i = 0; i<1E5; i++) {
		//	list.add(i+1);
		//}
		
		// Add items elsewhere
		for(int i = 0; i<1E5; i++) {
			list.add(0, i+1);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Current time take: " + (end - start)+ " ms for "+ type);
	}
}
