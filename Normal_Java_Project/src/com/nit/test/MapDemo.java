package com.nit.test;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Scott");
        studentRecords.put(102, "Smith");
        studentRecords.put(103, "Martin");
        studentRecords.put(104, "Aryan");

        System.out.println("Student Records: " + studentRecords);

     
        
        int searchId = 106;
        String studentName = studentRecords.get(searchId);
        
        if (studentName != null)
        {
            System.out.println("Student with ID " + searchId + " is " + studentName);
        } 
        else
        {
            System.out.println("Student with ID " + searchId + " not found.");
        }
             
      
        System.out.println(studentRecords.put(103, "Rahul"));
        System.out.println("Updated Records: " + studentRecords);
        
        
        
        String remove = studentRecords.remove(104);
        System.out.println("Removed student: " + remove);
        System.out.println("Records after removal: " + studentRecords);

        
        int idToCheck = 101;
        System.out.println("Does ID " + idToCheck + " exist? " + studentRecords.containsKey(idToCheck));

            
        String nameToCheck = "Aryan";
        System.out.println("Does name '" + nameToCheck + "' exist? " + studentRecords.containsValue(nameToCheck));

       
       
        System.out.println("Iterating through records:");
        for(HashMap.Entry<Integer, String> entry : studentRecords.entrySet()) 
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        studentRecords.clear();
        System.out.println("All records cleared: " + studentRecords); //{} 
     
     

		
		
		HashMap<String,Integer> hm1 = new HashMap<>();
		hm1.put("A", 1);
		hm1.put("A", 2);
		hm1.put(new String("A"), 3);
		System.out.println("Size is :"+hm1.size());
		System.out.println(hm1);
		
		System.out.println("....................");
		
		
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		hm2.put(128, 1);
		hm2.put(128, 2);
		System.out.println("Size is :"+hm2.size());
		System.out.println(hm2);
		System.out.println("....................");
				
		
		HashMap<Object,Object> hm3 = new HashMap<>();
		hm3.put("A", 1);
		hm3.put("A", 2);
		hm3.put(new String("A"), 3);
		hm3.put(new StringBuffer("A"),6);
		hm3.put(new StringBuffer("A"),7);
		hm3.put(65, 4);
		
		System.out.println("Size is :"+hm3.size());
		System.out.println(hm3);    


	}
}
