package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList arrList=new ArrayList();
		arrList.add(10);
		arrList.add(10.22);
		arrList.add(true); 
		arrList.add("akshay");
		arrList.add("ajay");
		
		 Employee emp1=new  Employee(1,"akshay",344343);
		 Employee emp2=new  Employee(2,"shyam",344343);
		 arrList.add(emp2);
		 arrList.add(emp1);
		 
		 //to display //1st method
		 System.out.println("using display method"); 
		 for(int i=0;i<arrList.size();i++) {
			 
			 System.out.println(arrList.get(i));
			 System.out.println("=====================");
		 }
		 
		 //2nd method to display
		 System.out.println("using itrerator method");
		 Iterator itr=arrList.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		 }

}
	
}