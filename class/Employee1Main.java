
public class Employee1Main
{
	public static void main(String[] args) {
		Employee1 e1=new Employee1(222,"Annu");
		Employee1 e2=new Employee1(222,"Annu");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}
}
