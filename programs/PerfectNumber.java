package pgms;

public class PerfectNumber 
{

	public static void main(String[] args)
	{
		int num=6;
		int sum=0;
		for(int i=1;i<=num-1;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"is perfect no");
		}
	}

}
