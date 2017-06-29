import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		return name;

	}
}

// Sort other than natural order
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();

		if (len1 > len2) {
			return 1;
		} else if (len2 > len1) {
			return -1;
		} else
			return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.compareTo(o2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}

}

public class App {

	////////////////////// Sorting Strings /////////////////////////////
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new AlphabeticalComparator());
		
		for(String animal: animals) {
			
			System.out.println(animal);
		}

		
		List<String> beasts = new ArrayList<String>();
		
		beasts.add("cat");
		beasts.add("elephant");
		beasts.add("tiger");
		beasts.add("lion");
		beasts.add("snake");
		beasts.add("mongoose");
		
		Collections.sort(beasts, new ReverseAlphabeticalComparator());
		
		for(String beast: beasts) {
			System.out.println(beast);
		}
		
		
		////////////////////// Sorting Numbers /////////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		Collections.sort(numbers);
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(3);
		values.add(36);
		values.add(73);
		values.add(40);
		values.add(1);
		
		Collections.sort(values, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				
				return -num1.compareTo(num2);
			}
			
		});
		
		for(Integer value: values) {
			System.out.println(value);
		}
		
		
		////////////////////// Sorting Arbitrary Classes /////////////////////////////
		////////////////////// Sorting In Order of ID /////////////////////////////
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(2, "Bob"));
		people.add(new Person(3, "Clare"));
		people.add(new Person(4, "Sue"));
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId()>p2.getId()) {
					return 1;
				}else if(p1.getId()<p2.getId()) {
					return -1;
				} 	
				return 0;
			}
			
		});
		
		for(Person person: people) {
			System.out.println(person);
		}

	
	////////////////////// Sorting In Order of Name /////////////////////////////
		
		Collections.sort(people, new Comparator<Person>() {

	@Override
	public int compare(Person p1, Person p2) {

		return p1.getName().compareTo(p2.getName());
	}

	});

	for(

	Person person:people)
	{
		System.out.println(person);
	}

}

}
