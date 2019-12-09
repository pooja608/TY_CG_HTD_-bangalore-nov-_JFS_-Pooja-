package Nestedtry;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("main started");
		Employee e1=new Employee();
		try {
			Object e2=e1.clone();
			try {
				Class c1=Class.forName("Employee");
			    System.out.println("class is found");
			}
		
			catch(ClassNotFoundException e3)
			{
			System.out.println("class not found");
		}
	}
	catch(CloneNotSupportedException o)
	{
		System.out.println("clone is not supported");
	}
	System.out.println("main ended");
	}

}
