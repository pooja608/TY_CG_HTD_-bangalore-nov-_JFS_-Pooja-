package finallyblock;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("dont deal with 0");
		}
		finally 
		{
			System.out.println("finally block is caleed");
		}
		System.out.println("main ended");
	}

}
