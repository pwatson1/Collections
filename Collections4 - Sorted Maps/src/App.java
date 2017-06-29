import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		// No guarantee what order items aare put in 
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// Items placed in natural order
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// Items sorted in natural order
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map){
		
		map.put(9, "Fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": "+ value);
		}
		
	}

}
