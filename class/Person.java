
public class Person 
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("Finalized method");
	}
	
	
	//public static void main(String[] args) throws Throwable
	//{
		//Person p1=new Person("Tannu");
		//p1.finalize();
	//}
}
