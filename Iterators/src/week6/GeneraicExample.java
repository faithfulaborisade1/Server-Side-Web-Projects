package week6;

import java.util.ArrayList;

public class GeneraicExample {
	
	public static <E> void printArray(E[] arrayElements){
		
		for(E el : arrayElements){
			System.out.printf("%s",el);
		}
		System.out.println();
		
	}
	
	public static <E> void printArray(ArrayList<E> listElements) {
		for(E el : listElements) {
			System.out.println(el);
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		Integer[] integerArray = {1,2,3,4,5};
		Double[] doubleArray = {1.2,2.3,3.4,5.6,7.7};
		Character[] charArray = {'H','E','L','L','O'};
		
		printArray(integerArray);
		printArray(doubleArray);
		printArray(charArray);
	}

}
