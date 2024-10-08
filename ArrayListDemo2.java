package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList arrList=new ArrayList();
		//collection diff datatype
		arrList.add(10);
		arrList.add(10.22);
		arrList.add(true); 
		arrList.add("akshay");
		arrList.add("akshay");
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
		 System.out.println("=====================");
		 //check whether int if present,else -1
		 boolean res=arrList.contains("akshay");
		 System.out.println(res);
		 
		 int res1=arrList.indexOf("akshay");
		 System.out.println(res1);
		 
		 
		 res1=arrList.lastIndexOf("akshay");
		 System.out.println("last index of"+res1);
		 
		 System.out.println("using remove metod");
		 	//to remov eobj
		 arrList.remove("akshay");//using obj
		 arrList.remove(1);//using index
        for(int i=0;i<arrList.size();i++) {
			 
			 System.out.println(arrList.get(i));
			 System.out.println("=====================");
		 }
		 //delete all elements
		 arrList.clear();
		 System.out.println(arrList.isEmpty());//t and f
		 arrList.addFirst(22);
		 arrList.addLast(26);
		 
		 //to change obj
		 arrList.set(1,88);
		 System.out.println("=====================");
		    for(int i=0;i<arrList.size();i++) {
				 
				 System.out.println(arrList.get(i));
				 System.out.println("=====================");
			 }

}
	
}