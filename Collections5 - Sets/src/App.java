import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// HasSets do not retain order
		// Set<String> set1 = new HashSet<String>();
		
		// Linked HashSet retains the order that added 
		// items in
		// Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSets generate items in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty.");
		}
		
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty.");
		}
		
		// Adding duplicate items does nothing. Sets only
		// contain unique items. 
		set1.add("mouse");
		
		System.out.println(set1);
		
		/////////// iteration /////////////
		
		for(String element: set1){
			System.out.println(element);
			
		}
		
		////// Does set contain a specific item ////////
		if(set1.contains("aardvark")) {
			System.out.println("Conatains aardvark");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Conatains cat");
		}
		
		// set2 contains some common elements with set1
		//and some new		
		Set<String> set2 = new TreeSet<String>();
		
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey ");
		set2.add("ant");
		
		//////////intersection ////////////
		
		Set<String> intersection = new HashSet<String>(set1);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);	
		

		//////////// Difference //////////////
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		
		System.out.println(difference);
		
	}

}
