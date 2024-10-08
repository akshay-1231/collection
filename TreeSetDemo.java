package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//treeset is sorted and homogenous
   //collection of int array
		TreeSet<Integer> tree1=new TreeSet<Integer>();
		tree1.add(10);
		tree1.add(20);
		tree1.add(45);
		tree1.add(145);
		 System.out.println("size is"+tree1.size());
		
		 System.out.println("using itrerator method");
		 Iterator itr=tree1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		 }
		 System.out.println("enhanced for loop");
		 for(int i : tree1) {
			 System.out.println(i);
			 
		 }
		 
		 
		 System.out.println("using sop");
		 System.out.println(tree1);	
		 //to remove the obj
		 tree1.remove(45);
		 
		 System.out.println("first"+tree1.first());
		 System.out.println("last"+tree1.last());
		 tree1.clear();
		 
		 System.out.println("is empty"+tree1.isEmpty());
		
	}

}
