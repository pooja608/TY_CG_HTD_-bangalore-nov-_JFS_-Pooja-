package pgms;

public class Palindrome
{
	public int check(int num)
	{
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}
