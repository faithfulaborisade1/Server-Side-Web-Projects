package week6;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array {
	
	public static void main(String [] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("T");
		al.add("H");
		al.add("U");
		al.add("R");
		al.add("S");
		al.add("D");
		al.add("A");
		al.add("Y");
		
		ListIterator litr =al.listIterator();
		System.out.println("original list");
		while(litr.hasNext()) {
			Object element = litr.next();
			System.out.println(element + " ");
		}
		
		ListIterator l = al.listIterator();
		
		while(l.hasNext()) {
			Object e = l.next();
			l.set(e+"+");
		}
		System.out.println("updated list ");
		ListIterator i = al.listIterator();
		
		while(i.hasNext()) {
			Object e1 = i.next();
			System.out.println(e1 + " ");
		}
		
	}
	
	
}
