import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// If you duplicate a key, it overrides the original
		map.put(5, "Five");	
		map.put(8, "Eight");
		map.put(3, "Three");
		map.put(6, "Six");
		map.put(10, "Ten");
		
		String text = map.get(3);
		System.out.println(text);
		
		// HashMap does not maintain any type of order
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			
			int key = entry.getKey();
			
			String value = entry.getValue();
			
			System.out.println(key + " = " + value);
			
		}

	}

}
