package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Character,String>table1=new Hashtable<Character,String>();
		table1.put('A', "akshay");
		table1.put('B', "aksh");
		table1.put('C', "ajay");
		table1.put('D', "kanchan");
		table1.put('E', "ram");
		table1.put('F', "shyam");
		
	
		System.out.println(table1.get('A'));
		System.out.println(table1.get('C'));
		System.out.println(table1.get('F'));
		
		
	}

}
