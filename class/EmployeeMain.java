
public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(22,"Annu");
		System.out.println(e1.hashCode());
		Employee e2=new Employee(23,"Tannu");
		System.out.println(e2.hashCode());
		System.out.println(e2);
		Object o1=new Object();
	}
}
