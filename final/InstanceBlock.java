
public class InstanceBlock
{
	 final int Max;
	 final static double PI;
	public InstanceBlock()
	{
		System.out.println("constructor is called");
	}
	public InstanceBlock(int a)
	{
		System.out.println("constructor overload ");
	}
	
	
	{
		this.Max=300;
		System.out.println("Instance initializer block executed");
		
		
	}
	
	static {
		System.out.println("static block is executed");
		PI=3.14;
	}
}
