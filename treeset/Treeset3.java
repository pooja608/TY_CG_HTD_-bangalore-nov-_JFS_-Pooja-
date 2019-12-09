package treeset;

import java.util.TreeSet;

public class Treeset3 {
	public static void main(String[] args) {
		Employeename e2=new Employeename();
		Employeesal e3=new Employeesal();
		TreeSet<Employee> t1=new TreeSet<Employee>(e3);
		t1.add(new Employee(22,1000,"neema"));
		t1.add(new Employee(23,2000,"hheema"));
		t1.add(new Employee(24,3000,"hiii"));
		
		for (Employee e1: t1) {
			System.out.println("employee name is"+e1.name);
			System.out.println("employee age is"+e1.age);
			System.out.println("employee salary is"+e1.salary);
			
			
		}
	}

}
