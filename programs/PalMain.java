package pgms;

public class PalMain 
{
	public static void main(String[] args)
	{
		int num=121;
		Palindrome p=new Palindrome();
		int ans=p.check(num);
		System.out.println(ans);
		if(num==ans)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not pal");
		}
	}
}
