package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset2 {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("google");
		l1.add("microsoft");
		l1.add(null);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
