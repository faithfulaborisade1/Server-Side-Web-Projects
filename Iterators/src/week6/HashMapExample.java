package week6;

import java.util.HashMap;

public class HashMapExample {
	
	private HashMap<String, Person> theListofPeople = new HashMap();
	
	public HashMapExample() {
		
		theListofPeople.put("Micheal", new Person("Micheal","Dublin",8792322));
		theListofPeople.put("Mary", new Person("Mary","Cork",874543233));
		theListofPeople.put("Claire", new Person("Claire","Westmeath",878976343));
		theListofPeople.put("John", new Person("John","Galway",879876523));
		
	}
	
	public Person getRefForName(String name) {
		return  theListofPeople.get(name);
	}

}
