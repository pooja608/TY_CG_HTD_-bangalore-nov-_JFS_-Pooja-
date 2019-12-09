package Exception1;

public class Nestedtry 
{
	void exception(int a, int b)
	{
		try
		{
			System.out.println(10/0);
			try {
				System.out.println(500/a);
			}
		
			catch(ArithmeticException a1)
			{
				System.out.println("dont deal with zero");
				
			}
		}
			catch(NullPointerException e)
			{
				System.out.println("dont deal with null");
			}
		
	}
}


		
	





