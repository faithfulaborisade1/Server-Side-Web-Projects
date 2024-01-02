package week6;

import java.util.ArrayList;

public class ArrayListExample {
	
	private ArrayList<Person> theListofPeople = new ArrayList();
	
	public ArrayListExample() {
		theListofPeople.add(new Person("Micheal","Dublin",876728832));
		theListofPeople.add(new Person("Mary","Cork",874543233));
		theListofPeople.add(new Person("Claire","Westmeath",878976343));
		theListofPeople.add(new Person("John","Galway",879876523));
		
	}
	
	public Person getRefForName(String pName) {
		
		for(Person p:theListofPeople) {
			if(p.getName().equals(pName)) {
				return p;
			}
		}
		return null;
	}
	
}
