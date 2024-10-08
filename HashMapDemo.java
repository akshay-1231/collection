package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//unsorted 
		HashMap<Character,String> hasmap=new HashMap<Character,String>();
		
		hasmap.put('A', "akshay");
		hasmap.put('B', "aksh");
		hasmap.put('C', "ajay");
		hasmap.put('D', "ram");
		hasmap.put('E', "kanchan");
		hasmap.put(null, "shyam");
		hasmap.put(null, "chhaya");
              // to display
		System.out.println(hasmap);
		
		boolean res=hasmap.containsKey('D');
		System.out.println(res);
		
		hasmap.remove('B');
		hasmap.replace('B', "AKSH","ADITYA");
		System.out.println(hasmap);
		System.out.println("======================");
		
		System.out.println("DISPLAYING THE KEYS");
		//get all keys of hasmap
		Object[]keys=hasmap.keySet().toArray();
		System.out.println("\nkeys");
		
		//to display
		 for(int i=0;i<keys.length;i++) {
			 System.out.println(keys[i]+"");
			 System.out.println(hasmap.get(keys[i]));
			 }
		 System.out.println("===============");
		 System.out.println("to get one value");
		 System.out.println(hasmap.get('A'));
		 
		 
		 }
		 
		
		
		
		
	}


