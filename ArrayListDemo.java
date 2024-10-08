package collection;
                                 
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arrList=new ArrayList();
		 //colection obj of same datatype
		 Employee emp1=new  Employee(1,"akshay",344343);
		 Employee emp2=new  Employee(2,"shyam",344343);
		 Employee emp3=new  Employee(3,"ajay",5434343);
		 Employee emp4=new  Employee(4,"ak",3454343);
		 Employee emp5=new  Employee(5,"aj",434343);
		 //add obj in collection arrList
		 
		 arrList.add(emp1);
		 arrList.add(emp2);
		 arrList.add(emp3);
		 arrList.add(emp4);
		 arrList.add(emp5);
		 //to display
		 for(int i=0;i<arrList.size();i++) {
			 System.out.println(arrList.get(i));
			 System.out.println("=====================");
		 }
		 
	}

}
