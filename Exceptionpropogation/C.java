package Exceptionpropogation;

public class C {
	static void m()
	{
		try
		{
		System.out.println(10/0);
	}catch(ArithmeticException a)
		{
		System.out.println("dont deal with 0");
		}

}
}
