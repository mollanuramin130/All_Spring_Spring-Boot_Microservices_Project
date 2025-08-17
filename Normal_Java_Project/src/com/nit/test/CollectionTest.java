package com.nit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		Vector<String> list2 = new Vector<String>(15, 4);
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");
		list.add("Ruby");	
		list.add("Go");
		list.add("Kotlin");
		
		System.out.println("List: "+list);
		
		System.out.println("Max: "+Collections.max(list));
		
		Collections.sort(list);
		Collections.reverse(list);
		list.forEach(lis->{
			System.out.println(lis);
		});
		
		Enumeration<String> elements = list2.elements();
		
		Enumeration<String> enumeration = Collections.enumeration(list);
		if(enumeration.hasMoreElements()) {
			System.out.println("\n\nElements in the enumeration:");
			while (enumeration.hasMoreElements()) {
				System.out.println(enumeration.nextElement());
			}
		} else {
			System.out.println("No elements in the enumeration.");
		}
		
//		list.iterator().forEachRemaining(System.out::println);
		
		Iterator<String> iterator = list.iterator();
		if(iterator.hasNext()) {
			System.out.println("\n\nElements in the iterator:");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} else {
			System.out.println("No elements in the iterator.");
		}
		
//		list.listIterator().forEachRemaining(System.out::println);
		
		ListIterator<String> listIterator = list.listIterator();
		if(listIterator.hasNext()) {
			System.out.println("\n\nElements in the list iterator:");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
		} else {
			System.out.println("No elements in the list iterator.");
		}
	}
}
