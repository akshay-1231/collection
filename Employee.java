package collection;

public class Employee {
   private int empNo;
   private String ename;
   private double salary;
public Employee(int empNo, String ename, double salary) {
	super();
	this.empNo = empNo;
	this.ename = ename;
	this.salary = salary;
}
public Employee() {
	empNo=0;
	ename=null;
	salary=0.0;
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
}
   
   
   
   
}
