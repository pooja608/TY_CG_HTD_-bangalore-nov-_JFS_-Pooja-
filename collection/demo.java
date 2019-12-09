package collect;
import java.util.ArrayList;
public class demo 
{


	public static void main(String[] args)
	
	{
		ArrayList a1=new ArrayList();
		int count=0;
		a1.add(10);
		a1.add(10.12);
		a1.add(100);
		a1.add('a');
		a1.add("qsp");
		a1.add("jsp");
		a1.add(null);
		a1.add(10);
		a1.add(null);
		a1.add(10.12);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++)
		{
			Object obj=a1.get(i);
			if(obj instanceof Double)
			{
				System.out.println(obj);
			}
			if(obj instanceof Character)
			{
				count++;
			}
		}
		System.out.println("the no. of character obj in a1 is:"+count);
	}

}
