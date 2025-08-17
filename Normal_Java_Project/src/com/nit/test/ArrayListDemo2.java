package com.nit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		
Boolean b1[] = new Boolean[6]; //true  true  false  true true true
		
		HashSet<Object> hs = new HashSet<>();
		b1[0] = hs.add("NIT");
		b1[1] = hs.add(12);
		b1[2] = hs.add(new String("NIT"));
		b1[3] = hs.add(false);
		b1[4] = hs.add(new StringBuffer("HYD"));
		b1[5] = hs.add(new StringBuffer("HYD"));
		
		System.out.println(Arrays.toString(b1));		
		hs.forEach(System.out::println);	

		
List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit", "Rahul");
		
		LinkedList<String> list = new LinkedList<>(listOfName); 
		list.add("Nur");
		list.forEach(System.out::println);
		
		System.out.println("....................");
		
		ArrayList<String> listOfCity = new ArrayList<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Kolkata");	
		
		LinkedList<String> cities3 = new LinkedList<>(listOfCity);
		cities3.add("Pune");		
		cities3.forEach(System.out::println);
		

		
		ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Banglore");
        cities.add("Chennai");
        
        System.out.println("Before sorting: " + cities);        
        
        System.out.println(cities.reversed());
        System.out.println(cities);
        cities.sort((s1,s2)-> s2.compareTo(s1));
        System.out.println("In Ascending Order :"+cities);          

       
        Collections.sort(cities);
        System.out.println("In Descending Order :"+cities);      
      

		
		List<Integer> listOfNumber2 = List.of(1,2,3,4,5,6);		
		//listOfNumber2.set(0,100); //java.lang.UnsupportedOperationException
		
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(listOfNumber);
		
		//listOfNumber.remove(0); //java.lang.UnsupportedOperationException
		//listOfNumber.add(8); //java.lang.UnsupportedOperationException
		
		listOfNumber.set(0, 100);
		System.out.println(listOfNumber);

		ArrayList<String> al1=new ArrayList<>();
		  al1.add("Ravi");
		  al1.add("Rahul");
		  al1.add("Rohit");		  
		  
		  ArrayList<String> al2=new ArrayList<>();
		  al2.add("Pallavi");
		  al2.add("Sweta");
		  al2.add("Puja");		  

		  al1.addAll(al2);  

        al1.forEach(str -> System.out.println(str.toUpperCase()) );

      System.out.println(".................................");

		  ArrayList<String> al3=new ArrayList<>();
		  al3.add("Ravi");
		  al3.add("Rahul");
		  al3.add("Rohit");		  
		  
		  ArrayList<String> al4=new ArrayList<>();
		  al4.add("Pallavi");
		  al4.add("Rahul");
		  al4.add("Raj");
		  
		  al3.retainAll(al4);  

        al3.forEach(x -> System.out.println(x));	

	}
}
