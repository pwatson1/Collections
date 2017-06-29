import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// adding items to an ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		System.out.println(numbers.get(0));
		
		// iterate over items
		System.out.println("\n Iteration #1");
		for(int i = 0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		System.out.println("\n Iteration #2");
		for(Integer number: numbers){System.out.println(number);
			
		}
		
		// remove the first item
		numbers.remove(0);
		
		// remove last item. Removing the last item is 
		// always faster.
		// numbers.remove(numbers.size()-1);
		
		System.out.println("\n Iteration #3");
		for(Integer number: numbers){System.out.println(number);
			
		}

	}

}
